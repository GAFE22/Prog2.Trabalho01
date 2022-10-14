import java.util.Scanner;

public class banco implements pessoajuridica{

    String nome;
    float saldo;

    public banco(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public banco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public static banco criarBanco(){

        Scanner scan = new Scanner(System.in);
        banco banco = new banco();

        System.out.println("Digite o nome");
        banco.setNome(scan.nextLine());

        System.out.println("Digite o saldo");
        banco.setSaldo(scan.nextFloat());

        return banco;

    }

}
