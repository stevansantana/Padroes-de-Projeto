
public class Cliente {

    private String nome;
    private Mediator mediator;

    public Cliente(String nome, Mediator mediator) {

        this.nome = nome;
        this.mediator = mediator;
    }

    public void realizarCompra(Fornecedor fornecedor, String produto) {

        mediator.realizarCompra(this, fornecedor, produto);
    }

    public String getNome() {
        
        return nome;
    }
}