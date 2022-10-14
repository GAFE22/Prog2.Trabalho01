import java.util.ArrayList;
import java.util.EmptyStackException;

public class Fila <T>{

    private final ArrayList<T> fila;

    public Fila()
    {
        this(10);
    }

    public Fila(int quantidade)
    {
        int qtdInicial = quantidade > 0 ? quantidade : 10;
        if(quantidade <= 0)
            System.out.println("Ta de zoação comigo?");
        fila = new ArrayList<T>(qtdInicial);
    }

    public void adicionar(T valor)
    {
        fila.add(valor);
        for(T elemento : fila)
            System.out.println(elemento);

        System.out.println();
    }

    public T remover()
    {
        if(fila.isEmpty())
        {
            System.out.println("Ta de brication uite me? Pra desempilhar tem que ter alguma coisa mané!");
            throw new EmptyStackException();
        }

        return fila.remove(0);
    }

}
