
public class Main {

    public static void main(String[] args) {

        MinhaLista lista = new MinhaLista();
        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            
            String elemento = iterator.next();
            System.out.println(elemento);
        }
    }
}