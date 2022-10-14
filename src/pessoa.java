import java.util.ArrayList;
import java.util.List;

public abstract class pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    List<conta> contas = new ArrayList<>();

    public pessoa(String nome, int idade, float altura, float peso, List<conta> contas) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.contas = contas;
    }

    public pessoa() {
    }

    public List<conta> getContas() {
        return contas;
    }

    public void setContas(List<conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
