const http = require("http");

class Ticket {
  constructor(numero) {
    this.numero = numero;
    this.tempoProcessamento = Math.floor(Math.random() * 5) + 1;
  }
}

let ticketNumber = 1;
let fila = [];
let processando = false; // Flag para controlar se há processamento em andamento

function processarProximoTicket() {
  if (fila.length > 0 && !processando) {
    processando = true;
    const nextTicket = fila.shift();

    console.log(
      `Ticket ${nextTicket.numero} processando. Espere ${nextTicket.tempoProcessamento} segundos.`
    );

    setTimeout(() => {
      console.log(`Ticket ${nextTicket.numero} concluído.`);
      processando = false; // Marca como concluído para processar o próximo ticket
      processarProximoTicket(); // Chama a função recursivamente para processar o próximo ticket
    }, nextTicket.tempoProcessamento * 1000);
  }
}

const server = http.createServer((req, res) => {
  res.writeHead(200, { "Content-Type": "text/html" });

  if (req.url === "/distribuir-ticket") {
    let ticket = new Ticket(ticketNumber);
    console.log(
      `Ticket ${ticketNumber} distribuído. Tempo de processamento: ${ticket.tempoProcessamento} segundos.`
    );
    ticketNumber++;

    console.log(`Ticket ${ticket.numero} adicionado na fila.`);

    fila.push(ticket);
    res.write(`<p>Ticket ${ticket.numero} adicionado na fila. Aguarde...</p>`);
  } else if (req.url === "/processar-semaforo") {
    if (fila.length > 0 && !processando) {
      processarProximoTicket();
    } else {
      console.log(
        "Não há tickets na fila ou um processo já está em andamento."
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
