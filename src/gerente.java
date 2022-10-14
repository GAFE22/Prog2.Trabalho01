import java.util.Scanner;

public class gerente extends funcionario implements pessoafisica{

    Fila<pessoa> pessoaFila = new Fila<>();

    public Fila<pessoa> getPessoaFila() {
        return pessoaFila;
    }

    public void setPessoaFila(Fila<pessoa> pessoaFila) {
        this.pessoaFila = pessoaFila;
    }

    public static gerente criarGerente(){

        Scanner scan = new Scanner(System.in);
        gerente gerente = new gerente();

        System.out.println("Digite o nome");
        gerente.setNome(scan.next());

        System.out.println("Digite a idade");
        gerente.setIdade(scan.nextInt());

        System.out.println("Digite a altura");
        gerente.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        gerente.setPeso(scan.nextFloat());

        gerente.setSalario(0);

        return gerente;

    }
}
