# Artistc Trivia Bot

## Requisitos

É necessário ter o [Node.Js LTS](https://nodejs.org/) instalado no seu computador para executar o projeto.

## Aviso

Todos os comandos informados nas sessões abaixo devem ser executados dentro da pasta "Projeto"

## Preparando o ambiente de desenvolvimento

Execute o comando abaixo para instalar as dependências do projeto localmente.

```
npm install
```

Além disso, é necessário criar e preencher corretamente o arquivo .env na raiz da pasta do projeto, para facilitar, copie o conteúdo do arquivo ".env.exemple" e preencha com os dados que faltam.

## Executar o projeto em modo de desenvolvimento com hot reload

```
npm run start
```

## Executar o projeto em modo de produção

Para a execução em modo de produção será necessário ter o docker eo docker compose instalados, além disso, o arquivo .env ainda deve ser criado e preenchido corretamente como dito acima.

```
docker compose --env-file .env up
```

Para excluir o container do projeto definitivamente da sua maquita rode o seguinte comando

```
docker compose down
```
