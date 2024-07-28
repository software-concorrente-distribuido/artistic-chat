import java.io.*;
import java.net.*;

public class MaioridadeServer {

    public static void main(String[] args) {
        //Cria um ServerSocket que escuta na porta 5000
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Servidor iniciado na porta 5000...");

            //Loop para aceitar conexões de clientes
            while (true) {
                //Aceita uma conexão de cliente
                try (Socket clienteSocket = serverSocket.accept();
                    //Cria um BufferedReader para ler os dados recebidos do cliente
                    BufferedReader in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                    //Cria um PrintWriter para enviar dados ao cliente
                    PrintWriter out = new PrintWriter(clienteSocket.getOutputStream(), true)) {

                    //Lê os dados enviados pelo cliente
                    String nome = in.readLine();
                    String sexo = in.readLine();
                    int idade = Integer.parseInt(in.readLine());

                    String resultado = verificarMaioridade(nome, sexo, idade);
                    out.println(resultado);

                } catch (IOException e) {
                    System.out.println("Erro ao comunicar com o cliente: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao iniciar o servidor: " + e.getMessage());
        }
    }
    // Método para verificar a maioridade baseado no sexo e idade
    private static String verificarMaioridade(String nome, String sexo, int idade) {
        boolean maioridade = false;
        if (sexo.equalsIgnoreCase("masculino")) {
            maioridade = idade >= 18;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            maioridade = idade >= 21;
        }

        if (maioridade) {
            return nome + " já atingiu a maioridade.";
        } else {
            return nome + " ainda não atingiu a maioridade.";
        }
    }
}
