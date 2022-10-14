import java.util.Scanner;

public class diretor extends funcionario implements pessoafisica,diretoria{

    Fila<coordenador> filacoordenodor = new Fila<>();

    public Fila<coordenador> getFilacoordenodor() {
        return filacoordenodor;
    }

    public void setFilacoordenodor(Fila<coordenador> filacoordenodor) {
        this.filacoordenodor = filacoordenodor;
    }

    public static diretor criardireto(){

        Scanner scan = new Scanner(System.in);
        diretor diretor = new diretor();

        System.out.println("Digite o nome");
        diretor.setNome(scan.next());

        System.out.println("Digite a idade");
        diretor.setIdade(scan.nextInt());

        System.out.println("Digite a altura");
        diretor.setAltura(scan.nextFloat());

        System.out.println("Digite o peso");
        diretor.setPeso(scan.nextFloat());

        diretor.setSalario(0);

        return diretor;

    }
}
