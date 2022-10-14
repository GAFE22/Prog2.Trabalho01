import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class curso {

    String nome;
    coordenador coordenador;
    List<diciplina> diciplinas = new ArrayList<>();

    public curso(String nome, coordenador coordenador, List<diciplina> diciplinas) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.diciplinas = diciplinas;
    }

    public curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public List<diciplina> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(List<diciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }

    public static curso criarcurso(){

        Scanner scan = new Scanner(System.in);
        curso curso = new curso();

        System.out.println("Digite o nome");
        curso.setNome(scan.nextLine());

        return curso;
    }
}
