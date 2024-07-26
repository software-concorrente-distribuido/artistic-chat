import * as gameService from './game.service';
import * as telegramService from './telegram.service';
import * as userRepo from '../repositories/user.repo';
import * as gameRepo from '../repositories/game.repo';
import { IGame } from '../models/game.model';

export const messageRecived = async (msg: any) => {
  const message = msg.text;
  const chatId = msg.from.id;

  const user = await userRepo.getOneByChatId(chatId);
  const lastGame = !user?.lastGame
    ? null
    : await gameRepo.getOneById(user.lastGame);
  if (!user) {
    const newUser = {
      chatId: chatId,
      firstname: msg.from.first_name,
      lastname: msg.from.last_name,
      isBot: msg.from.is_bot,
      languageCode: msg.from.language_code,
    };
    console.log('newUser ', newUser);
    await userRepo.create(newUser);
    const options = {
      reply_markup: {
        keyboard: [[{ text: 'Jogar Trivia' }, { text: 'Gerar Imagem' }]],
        resize_keyboard: true,
        one_time_keyboard: true,
      },
    };
    telegramService.sendMessage(
      chatId,
      'Bem vindo ao Artistic Trivia Bot!',
      options
    );
  } else if (!user.activeGame && !lastGame?.answers?.includes(message)) {
    if (message === 'Jogar Trivia') {
      const game = await gameService.startGame(user);
    } else {
      const game = await gameService.startGame(user);
    }
  } else if (user.activeGame) {
    const game = (await gameRepo.getByIdAndPopulate(user.activeGame)) as IGame;
    const chatId1 =
      (game?.user1 as unknown as { chatId: number })?.chatId ?? null;
    const chatId2 =
      (game?.user2 as unknown as { chatId: number })?.chatId ?? null;

    const otherPlayerChatId = chatId === chatId1 ? chatId2 : chatId1;

    if (message === '/cancelar') {
      telegramService.sendMessage(chatId, 'Jogo cancelado!');
      if (otherPlayerChatId) {
        telegramService.sendMessage(
          otherPlayerChatId,
          'O outro jogador cancelou o jogo!'
        );
      }
      game.awnswer = '';
      if (game?.user1) {
        await userRepo.cancelGame(game.user1);
      }
      if (game?.user2) {
        await userRepo.cancelGame(game.user2);
      }
      game.user1 = null;
      game.user2 = null;
      await gameRepo.update(game);

      return;
    }

    if (!game?.user2) {
      telegramService.sendMessage(
        chatId,
        'Aguarde o próximo jogador! Ou digite /cancelar para cancelar o jogo!'
      );
      return;
    }

    if (message === '/cancelar') {
      telegramService.sendMessage(chatId, 'Jogo cancelado!');
      telegramService.sendMessage(
        otherPlayerChatId,
        'O outro jogador cancelou o jogo!'
      );

      game.awnswer = '';
      if (game?.user1) {
        await userRepo.cancelGame(game.user1);
      }
      if (game?.user2) {
        await userRepo.cancelGame(game.user2);
      }

      game.user1 = null;
      game.user2 = null;
      console.log('game', game);
      await gameRepo.update(game);

      return;
    }

    if (!game.awnswer) {
      telegramService.sendMessage(chatId, 'Aguarde a próxima pergunta!');
      return;
    }

    if (game.answers?.includes(message)) {
      if (
        (chatId == chatId1 && game.user1trie) ||
        (chatId == chatId2 && game.user2trie)
      ) {
        telegramService.sendMessage(
          chatId,
          'Você já tentou responder essa pergunta! Aguarde a próxima pergunta!'
        );
        return;
      }
      if (message === game.awnswer) {
        await Promise.all([
          telegramService.sendMessage(
            chatId,
            'Resposta correta! Aguarde a próxima pergunta!'
          ),
          telegramService.sendMessage(
            otherPlayerChatId,
            'O outro jogador acerto a pergunta antes de você. Aguarde a próxima pergunta!'
          ),
        ]);
        // give points to the player
        user.chatId == chatId1 ? game.points1++ : game.points2++;

        if (game.points1 === 5 || game.points2 === 5) {
          telegramService.sendMessage(chatId, 'Você ganhou o jogo!');
          telegramService.sendMessage(otherPlayerChatId, 'Você perdeu o jogo!');

          await userRepo.cancelGame(game.user1);
          await userRepo.cancelGame(game.user2);
          return;
        }
        game.awnswer = '';
        game.user1trie = false;
        game.user2trie = false;
        await gameRepo.update(game);
        await gameService.sendCurrentPoints(game);
        await gameService.sendQuestion(game);
        return;
      }

      if (message !== game.awnswer) {
        await telegramService.sendMessage(
          chatId,
          'Resposta incorreta! Aguarde o próximo jogador!'
        );
        console.log('user1', user._id);
        console.log('game.user1', game.user1._id);
        console.log('game.user2', game.user2._id);
        if (chatId == chatId1) {
          game.user1trie = true;
        } else {
          game.user2trie = true;
        }
        await gameRepo.update(game);
        if (game.user1trie && game.user2trie) {
          await Promise.all([
            telegramService.sendMessage(
              chatId1,
              'Ambos erraram a pergunta! Aguarde a próxima pergunta!'
            ),
            telegramService.sendMessage(
              chatId2,
              'Ambos erraram a pergunta! Aguarde a próxima pergunta!'
            ),
          ]);
          game.awnswer = '';
          game.user1trie = false;
          game.user2trie = false;
          await gameRepo.update(game);
          await gameService.sendCurrentPoints(game);
          await gameService.sendQuestion(game);
          return;
        }
        return;
      }
    }
  }
};

//Botão de opções no teclado

// const options = {
//   reply_markup: {
//     inline_keyboard: [
//       [
//         { text: 'Option 1', callback_data: 'option1' },
//         { text: 'Option 2', callback_data: 'option2' },
//       ],
//     ],
//     one_time_keyboard: true,
//   },
// };

// send a message to the chat acknowledging receipt of their message
