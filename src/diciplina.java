import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class diciplina {

    String nome;
    professor professor;
    List<aluno> alunos = new ArrayList<>();
    int limitiminaluno;
    int limitimaxaluno;

    public diciplina(String nome, professor professor, List<aluno> alunos, int limitiminaluno, int limitimaxaluno) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
        this.limitiminaluno = limitiminaluno;
        this.limitimaxaluno = limitimaxaluno;
    }

    public diciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public professor getProfessor() {
        return professor;
    }

    public void setProfessor(professor professor) {
        this.professor = professor;
    }

    public List<aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<aluno> alunos) {
        this.alunos = alunos;
    }

    public int getLimitiminaluno() {
        return limitiminaluno;
    }

    public void setLimitiminaluno(int limitiminaluno) {
        this.limitiminaluno = limitiminaluno;
    }

    public int getLimitimaxaluno() {
        return limitimaxaluno;
    }

    public void setLimitimaxaluno(int limitimaxaluno) {
        this.limitimaxaluno = limitimaxaluno;
    }

    public static diciplina criraprofessor(){

        Scanner scan = new Scanner(System.in);
        diciplina diciplina = new diciplina();

        System.out.println("Limite maximo dos alunos");
        diciplina.setLimitimaxaluno(scan.nextInt());

        System.out.println("Limite mimimo dos aluno");
        diciplina.setLimitiminaluno(scan.nextInt());

        System.out.println("Digite o nome");
        diciplina.setNome(scan.nextLine());


        return diciplina;

    }
}
