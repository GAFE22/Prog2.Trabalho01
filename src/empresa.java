public abstract class empresa {

    String nome;
    String endero;

    public empresa(String nome, String endero) {
        this.nome = nome;
        this.endero = endero;
    }

    public empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndero() {
        return endero;
    }

    public void setEndero(String endero) {
        this.endero = endero;
    }
}
