import java.util.Scanner;

public class secfinanceiro extends funcionario implements pessoafisica,secretaria{

    Fila<pessoafisica> pessoafisicaFila = new Fila<>();

    public Fila<pessoafisica> getPessoafisicaFila() {
        return pessoafisicaFila;
    }

    public void setPessoafisicaFila(Fila<pessoafisica> pessoafisicaFila) {
        this.pessoafisicaFila = pessoafisicaFila;
    }

    public static secfinanceiro  criarSecretario(){

        Scanner scan = new Scanner(System.in);
        secfinanceiro secfinanceiro = new secfinanceiro();

        System.out.println("Digite o nome");
        secfinanceiro.setNome(scan.next());

        System.out.println("Digite a idade");
        secfinanceiro.setIdade(scan.nextInt());

        System.out.println("Digite a altura");
        secfinanceiro.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        secfinanceiro.setPeso(scan.nextFloat());

        secfinanceiro.setSalario(0);

        return secfinanceiro;


    }

}
