
public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Loja();
        Cliente cliente1 = new Cliente("Alice", mediator);
        Cliente cliente2 = new Cliente("Bob", mediator);
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", mediator);
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", mediator);

        mediator.adicionarCliente(cliente1);
        mediator.adicionarCliente(cliente2);
        mediator.adicionarFornecedor(fornecedor1);
        mediator.adicionarFornecedor(fornecedor2);

        cliente1.realizarCompra(fornecedor1, "Produto X");
        cliente2.realizarCompra(fornecedor2, "Produto Y");
        fornecedor1.oferecerProduto("Produto Z");
    }
}