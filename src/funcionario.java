import java.util.List;

public abstract class funcionario extends pessoa {

    double salario;

    public funcionario(String nome, int idade, float altura, float peso, List<conta> contas, double salario) {
        super(nome, idade, altura, peso, contas);
        this.salario = salario;
    }

    public funcionario(double salario) {
        this.salario = salario;
    }

    public funcionario() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
