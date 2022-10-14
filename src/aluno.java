import java.util.List;
import java.util.Scanner;

public class aluno extends pessoa implements pessoafisica{

    String matricula;

    public aluno(String nome, int idade, float altura, float peso, List<conta> contas, String matricula) {
        super(nome, idade, altura, peso, contas);
        this.matricula = matricula;
    }

    public aluno(String matricula) {
        this.matricula = matricula;
    }

    public aluno() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static aluno criaraluno(){

        Scanner scan = new Scanner(System.in);
        aluno aluno = new aluno();

        System.out.println("Digite o nome");
        aluno.setNome(scan.next());

        System.out.println("Digite a idade");
        aluno.setIdade(scan.nextInt());

        System.out.println("Digite a matricula");
        aluno.setMatricula(scan.next());

        System.out.println("Digite a altura");
        aluno.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        aluno.setPeso(scan.nextFloat());

        return  aluno;

    }

    public void adicionarConta(conta conta){
        this.contas.add(conta);
    }

}
