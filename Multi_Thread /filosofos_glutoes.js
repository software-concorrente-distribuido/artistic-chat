const { Worker, isMainThread, workerData } = require("worker_threads");
const { randomInt } = require("crypto");

const numPhilosophers = 5;
const forks = new Array(numPhilosophers).fill(false); // Garfos disponíveis

if (isMainThread) {
  // Função para iniciar uma nova thread para cada filósofo
  function iniciarFilosofo(id) {
    const worker = new Worker(__filename, { workerData: { id } });

    worker.on("message", (message) => {
      console.log(`Filósofo ${id} enviou uma mensagem: ${message}`);
    });

    worker.on("error", (error) => {
      console.error(`Erro no Filósofo ${id}:`, error);
    });

    worker.on("exit", (code) => {
      if (code !== 0) {
        console.error(`Filósofo ${id} saiu com código de erro ${code}`);
      }
    });
  }

  // Inicia uma thread para cada filósofo
  for (let i = 0; i < numPhilosophers; i++) {
    iniciarFilosofo(i);
  }

  console.log("Todos os filósofos iniciados.");
} else {
  const { id } = workerData;

  console.log(`Filósofo ${id} sentou-se à mesa.`);

  // Simula o comportamento do filósofo
  function filosofar() {
    setTimeout(() => {
      // Tenta pegar o garfo à esquerda
      const leftFork = id;
      const rightFork = (id + 1) % numPhilosophers;

      if (!forks[leftFork]) {
        forks[leftFork] = true;

        console.log(`Filósofo ${id} pegou o garfo à esquerda.`);
        setTimeout(() => {
          if (!forks[rightFork]) {
            forks[rightFork] = true;

            console.log(`Filósofo ${id} pegou o garfo à direita.`);
            console.log(`Filósofo ${id} está comendo.`);

            forks[leftFork] = false;
            forks[rightFork] = false;
          } else {
            console.log(
              `Filósofo ${id} não conseguiu pegar o garfo à direita.`
            );
            forks[leftFork] = false;
            filosofar(); // Tenta novamente após um tempo
          }
        }, randomInt(500, 1500)); // Tempo aleatório de espera entre 500ms e 1500ms
      } else {
        console.log(`Filósofo ${id} está esperando pelo garfo à esquerda.`);
        filosofar(); // Tenta novamente após um tempo
      }
    }, randomInt(500, 1500)); // Tempo aleatório de espera entre 500ms e 1500ms
  }

  filosofar(); // Inicia o comportamento do filósofo
}
