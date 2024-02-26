
public class Fornecedor {

    private String nome;
    private Mediator mediator;

    public Fornecedor(String nome, Mediator mediator) {

        this.nome = nome;
        this.mediator = mediator;
    }

    public void oferecerProduto(String produto) {

        System.out.println("[" + nome + "] oferecendo produto: " + produto);
        mediator.realizarCompra(null, this, produto);
    }

    public String getNome() {
        
        return nome;
    }
}