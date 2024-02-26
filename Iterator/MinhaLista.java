import java.util.Iterator;

public class MinhaLista implements Iterable<String> {

    private String[] lista = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

    // Método da interface Iterable que retorna um objeto Iterator
    @Override
    public Iterator<String> iterator() {
        
        return new MinhaIterator();
    }
}