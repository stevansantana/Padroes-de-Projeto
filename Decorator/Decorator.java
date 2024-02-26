public abstract class Decorator implements Produto {
    
    protected Produto produto;

    public Decorator(Produto produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return produto.getDescricao();
    }

    public double getPreco() {
        return produto.getPreco();
    }
}
