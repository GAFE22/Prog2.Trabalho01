import java.util.List;
import java.util.Scanner;

public class presidente extends funcionario implements pessoafisica,diretoria{

    public presidente(String nome, int idade, float altura, float peso, List<conta> contas, double salario) {
        super(nome, idade, altura, peso, contas, salario);
    }

    public presidente(double salario) {
        super(salario);
    }

    public presidente() {
    }

    private static presidente criarPresidente(){
        Scanner scan = new Scanner(System.in);
        presidente presidente = new presidente();

        System.out.println("Digite o nome");
        presidente.setNome(scan.next());

        System.out.println("Digite a idade");
        presidente.setIdade(scan.nextInt());

        System.out.println("Digite a altura");
        presidente.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        presidente.setPeso(scan.nextFloat());

        presidente.setSalario(0);

        return presidente;

    }

}
