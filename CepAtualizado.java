
import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;
import java.io.IOException;
import java.util.Scanner;

public class Cep {

    public static void main(String[] args) {

        ViaCEPClient cliente = new ViaCEPClient();
        Scanner recebe = new Scanner(System.in);
        Objetos objetos = new Objetos();
        InsercaoBanco insercao  = new InsercaoBanco();

        try {
            System.out.println("Informe o seu cep: ");
            String rCep = recebe.nextLine();
            ViaCEPEndereco endereco = cliente.getEndereco(rCep);
            System.out.println("Infome o seu Bairo: ");
            String rBairro = recebe.nextLine();
            System.out.println("Infome o seu Logradouro: ");
            String rLogradouro = recebe.nextLine();
            System.out.println("Informe um complemento? Se não quiser aperte |enter| ");
            String rComplemento = recebe.nextLine();

            //Bloco de interação com usuário
            System.out.println(" Seus Dados São : ");
            System.out.println("|Sua cidade é: " + endereco.getLocalidade() + " |");
            objetos.rlocalidade = endereco.getLocalidade();
            System.out.println("|Sua unidade Federativa é: " + endereco.getUf() + " |");
            objetos.ruf = endereco.getUf();
            System.out.println("|Seu codigo do IBGE é: " + endereco.getIbge() + " |");
            objetos.rcodigo_ibge = endereco.getIbge();
            System.out.print("|Seu bairro é: " + rBairro + " |");
           
            System.out.print("|Seu logradouro é: " + rLogradouro + " |");

            System.out.print("|Seu complemento é:" + rComplemento + " |");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
