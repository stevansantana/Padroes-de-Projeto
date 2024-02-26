public class ProdutoBase implements Produto {
    
    private String descricao;
    private double preco;

    public ProdutoBase(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}