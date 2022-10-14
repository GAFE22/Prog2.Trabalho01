import java.util.Scanner;

public class contacorrente {

    float saldo;
    int conta;
    int agencia;
    String senha;

    public contacorrente(float saldo, int conta, int agencia, String senha) {
        this.saldo = saldo;
        this.conta = conta;
        this.agencia = agencia;
        this.senha = senha;
    }

    public contacorrente() {
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static contacorrente criarConta(){
        Scanner scan = new Scanner(System.in);
        contacorrente conta = new contacorrente();

        System.out.println("Digite o numero da conta");
        conta.setConta(scan.nextInt());

        System.out.println("Digite o numero da agencia");
        conta.setAgencia(scan.nextInt());

        System.out.println("Digite a senha a senha");
        conta.setSenha(scan.nextLine());

        conta.setSaldo(0);

        return conta;
    }
}
