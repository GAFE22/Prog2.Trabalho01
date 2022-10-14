public class coordenador extends funcionario implements pessoafisica,diretoria{

    Fila<professor> fila = new Fila<>();

    public Fila<professor> getFila() {
        return fila;
    }

    public void setFila(Fila<professor> fila) {
        this.fila = fila;
    }
}
