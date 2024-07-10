import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Semaphore;

public class SemaphoreServer {
    private static final int PORT = 12345;

    // Número máximo de conexões simultâneas permitidas
    private static final int MAX_CONNECTIONS = 5;

    // Semáforo para controlar o número de conexões
    private static Semaphore semaphore = new Semaphore(MAX_CONNECTIONS);

    public static void main(String[] args) {
        // Bloco try-with-resources para garantir que o ServerSocket seja fechado corretamente
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado na porta " + PORT);

            // Loop para aceitar conexões de clientes
            while (true) {

                Socket clientSocket = serverSocket.accept();
                System.out.println("Conexão aceita de " + clientSocket.getInetAddress());

                // Adquire uma permissão do semáforo antes de iniciar uma nova thread
                semaphore.acquire();
                // Inicia uma nova thread para lidar com o cliente
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Classe para lidar com cada conexão de cliente
    private static class ClientHandler implements Runnable {
        private Socket clientSocket;
        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }
        @Override
        public void run() {
            // Bloco try-with-resources para garantir que os streams sejam fechados
            try (InputStream input = clientSocket.getInputStream();
                 OutputStream output = clientSocket.getOutputStream()) {
                // Buffer para leitura de dados
                byte[] buffer = new byte[1024];
                int bytesRead;
                // Loop para ler dados do cliente e enviar de volta
                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Garante que o socket do cliente seja fechado
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // Libera uma permissão do semáforo após o término do processamento do cliente
                semaphore.release();
                System.out.println("Conexão encerrada e semáforo liberado.");
            }
        }
    }
}