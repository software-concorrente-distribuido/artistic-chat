import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MaioridadeCliente {
    public static void main(String[] args) {
        //Tenta conectar ao servidor na porta 5000
        try (Socket socket = new Socket("localhost", 5000);
            //Cria um PrintWriter para enviar dados ao servidor
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            //Cria um BufferedReader para ler os dados recebidos do servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in)) {

            //Solicita os dados do usuario
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            String sexo = "";
            while (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")) {
                System.out.print("Digite o sexo (masculino/feminino): ");
                sexo = scanner.nextLine();
                if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")) {
                    System.out.println("Sexo inválido. Por favor, insira 'masculino' ou 'feminino'.");
                }
            }

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            //Envia os dados ao servidor
            out.println(nome);
            out.println(sexo);
            out.println(idade);

            //Lê a resposta do servidor
            String resposta = in.readLine();
            System.out.println(resposta);

        } catch (IOException e) {
            System.out.println("Erro ao comunicar com o servidor: " + e.getMessage());
        }
    }
}
