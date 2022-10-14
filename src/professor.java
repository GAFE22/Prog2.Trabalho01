import java.util.Scanner;

public class professor extends funcionario implements pessoafisica{

    Fila<aluno> alunoFila = new Fila<>();

    public Fila<aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }

    public static professor criarprofessor(){

        Scanner scan = new Scanner(System.in);
        professor professor = new professor();

        System.out.println("Digite o nome");
        professor.setNome(scan.next());

        System.out.println("Digite a idade");
        professor.setIdade(scan.nextInt());

        System.out.println("Digite a altura");
        professor.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        professor.setPeso(scan.nextFloat());

        professor.setSalario(0);

        return professor;
    }

}
