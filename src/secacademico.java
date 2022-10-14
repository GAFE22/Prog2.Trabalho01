import java.util.Scanner;

public class secacademico extends funcionario implements pessoafisica,secretaria{

    Fila<aluno> alunoFila = new Fila<>();


    public Fila<aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }

    public static secacademico  criarSecretario(){

        Scanner scan = new Scanner(System.in);
        secacademico secacademico = new secacademico();

        System.out.println("Digite o nome");
        secacademico.setNome(scan.next());

        System.out.println("Digite a idade");
        secacademico.setIdade(scan.nextInt());

        System.out.println("Digite a altura");
        secacademico.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        secacademico.setPeso(scan.nextFloat());

        secacademico.setSalario(0);

        return secacademico;


    }

}
