import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class faculdade implements pessoajuridica{

    String nome;
    diretor diretor = new diretor();
    List<coordenador> coordenadors = new ArrayList<>();
    List<secacademico> secacademicos = new ArrayList<>();
    List<secfinanceiro> secfinanceiros = new ArrayList<>();
    List<curso> cursos = new ArrayList<>();

    public faculdade(String nome, diretor diretor, List<coordenador> coordenadors, List<secacademico> secacademicos, List<secfinanceiro> secfinanceiros, List<curso> cursos) {
        this.nome = nome;                                   
        this.diretor = diretor;
        this.coordenadors = coordenadors;
        this.secacademicos = secacademicos;
        this.secfinanceiros = secfinanceiros;
        this.cursos = cursos;
    }

    public faculdade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(diretor diretor) {
        this.diretor = diretor;
    }

    public List<coordenador> getCoordenadors() {
        return coordenadors;
    }

    public void setCoordenadors(List<coordenador> coordenadors) {
        this.coordenadors = coordenadors;
    }

    public List<secacademico> getSecacademicos() {
        return secacademicos;
    }

    public void setSecacademicos(List<secacademico> secacademicos) {
        this.secacademicos = secacademicos;
    }

    public List<secfinanceiro> getSecfinanceiros() {
        return secfinanceiros;
    }

    public void setSecfinanceiros(List<secfinanceiro> secfinanceiros) {
        this.secfinanceiros = secfinanceiros;
    }

    public List<curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<curso> cursos) {
        this.cursos = cursos;
    }

    public static faculdade criarfaculdade(){

        Scanner scan = new Scanner(System.in);
        faculdade faculdade = new faculdade();

        System.out.println("Digite o nome");
        faculdade.setNome(scan.nextLine());

        return faculdade;
    }
}
