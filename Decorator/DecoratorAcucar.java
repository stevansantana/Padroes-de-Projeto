public class DecoratorAcucar extends Decorator {
    
    public DecoratorAcucar(Produto produto) {
        super(produto);
    }

    public String getDescricao() {
        return super.getDescricao() + ", com açúcar";
    }

    public double getPreco() {
        return super.getPreco() + 1.0;
    }
}