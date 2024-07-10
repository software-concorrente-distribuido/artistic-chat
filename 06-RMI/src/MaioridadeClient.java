import java.rmi.Naming;
import java.util.Scanner;

public class MaioridadeClient {
    public static void main(String[] args) {
        try {
            MaioridadeService service = (MaioridadeService) Naming.lookup("rmi://localhost:1099/MaioridadeService");

            Scanner scanner = new Scanner(System.in);

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

            String resultado = service.verificarMaioridade(nome, sexo, idade);
            System.out.println(resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
