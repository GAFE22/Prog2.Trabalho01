import java.util.Scanner;

public class agencia {

    String nome;
    String endereco;

    public agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public agencia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static agencia criaragencia(){
        Scanner scan = new Scanner(System.in);
        agencia agencia = new agencia();

        System.out.println("Digite o nome");
        agencia.setNome(scan.nextLine());

        System.out.println("Digete o endereço");
        agencia.setEndereco(scan.nextLine());

        return agencia;

    }

}
