const http = require("http");

class Ticket {
  constructor(numero) {
    this.numero = numero;
    this.processado = false;
    this.tempoProcessamento = Math.floor(Math.random() * 5) + 1;
  }
}

let semaphore = 1; // Semáforo começa em verde (1 para livre, 0 para ocupado)
let ticketNumber = 1;
let fila = [];

const server = http.createServer((req, res) => {
  res.writeHead(200, { "Content-Type": "text/html" });

  if (req.url === "/distribuir-ticket") {
    let ticket = new Ticket(ticketNumber);
    console.log(
      `Ticket ${ticketNumber} distribuído. Tempo de processamento: ${ticket.tempoProcessamento} segundos.`
    );
    ticketNumber++;

    if (semaphore === 1) {
      semaphore = 0;
      console.log(
        `Ticket ${ticket.numero} processando. Espere ${ticket.tempoProcessamento} segundos.`
      );

      do {
        setTimeout(() => {
          console.log(`Ticket ${ticket.numero} concluído.`);
          ticket.processado = true;
          semaphore = 1;
          if (fila.length > 0) {
            const nextTicket = fila.shift();
            console.log(
              `Ticket ${nextTicket.numero} processando. Espere ${nextTicket.tempoProcessamento} segundos.`
            );
            setTimeout(() => {
              console.log(`Ticket ${nextTicket.numero} concluído.`);
              nextTicket.processado = true;
            }, nextTicket.tempoProcessamento * 1000);
          }
        }, ticket.tempoProcessamento * 1000);
      } while (fila.length > 0);

      res.write(`<p>Ticket ${ticket.numero} distribuído. Aguarde...</p>`);
    } else {
      console.log(`Ticket ${ticket.numero} adicionado na fila.`);
      fila.push(ticket);
      res.write(
        `<p>Ticket ${ticket.numero} adicionado na fila. Aguarde...</p>`
      );
    }
  } else {
    res.write("<p>Rota não encontrada!</p>");
  }

  res.end();
});

const PORT = process.env.PORT || 3000;

server.listen(PORT, () => {
  console.log(`Servidor rodando em http://localhost:${PORT}/`);
});
