import com.example.tarefaprotocl.protos.ListaPessoas;
import com.example.tarefaprotocl.protos.Pessoa;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class AddPessoa {
    static Pessoa PromptForAddress(BufferedReader stdin,
                                   PrintStream stdout) throws IOException {
        Pessoa.Builder pessoa = Pessoa.newBuilder();

        stdout.print("Nome da Pessoa: ");
        pessoa.setNome(stdin.readLine());

        stdout.print("Idade da Pessoa: ");
        pessoa.setIdade(Integer.valueOf(stdin.readLine()));

        stdout.print("Tipo Sanguineo da Pessoa? ");
        String type = stdin.readLine();
        if (type.equals("A+")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_AP);
        } else if (type.equals("A-")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_AN);
        } else if (type.equals("B+")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_BP);
        } else if (type.equals("B-")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_BN);
        } else if (type.equals("O+")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_OP);
        } else if (type.equals("O-")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_ON);
        } else if (type.equals("AB+")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_ABP);
        } else if (type.equals("AB-")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_ABN);
        } else if (type.equals("RN")) {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_NULL);
        } else {
            pessoa.setType(Pessoa.TipoSangioneo.TIPO_SANGUINEO_NAOESPECIFICADO);
            stdout.println("Tipo Sanguineo nao reconhecido. Definindo como Nao Especificado.");
        }

        return pessoa.build();
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage:  AdicionarPEssoa ArquivoPessoa");
            System.exit(-1);
        }

        ListaPessoas.Builder listaPessoas = ListaPessoas.newBuilder();

        try {
            listaPessoas.mergeFrom(new FileInputStream(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println(args[0] + ": Arquivo nao encontrado. Criando novo arquivo...");
        }

        listaPessoas.addPessoas(
                PromptForAddress(new BufferedReader(new InputStreamReader(System.in)),
                        System.out));

        FileOutputStream output = new FileOutputStream(args[0]);
        listaPessoas.build().writeTo(output);
        output.close();
    }
}