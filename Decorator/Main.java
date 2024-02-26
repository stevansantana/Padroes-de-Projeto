public class Main {
    
    public static void main(String[] args) {
        // Criação do produto base
        Produto produtoBase = new ProdutoBase("Bolo de chocolate", 10.0);

        // Adição de açúcar e chantilly
        produtoBase = new DecoratorAcucar(produtoBase);
        produtoBase = new DecoratorChantilly(produtoBase);

        // Exibição da descrição e preço final do produto
        System.out.println("Descrição do produto: " + produtoBase.getDescricao());
        System.out.println("Preço final do produto: R$ " + produtoBase.getPreco());
    }
}





