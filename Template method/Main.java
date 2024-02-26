
public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3000.0);
        LojaTemplate loja = new LojaOnline();
        loja.realizarVenda(produto);
    }
}