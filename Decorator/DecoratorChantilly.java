public class DecoratorChantilly extends Decorator {
    
    public DecoratorChantilly(Produto produto) {
        super(produto);
    }

    public String getDescricao() {
        return super.getDescricao() + ", com chantilly";
    }

    public double getPreco() {
        return super.getPreco() + 2.0;
    }
}