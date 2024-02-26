

public class Loja implements Mediator {

    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, Fornecedor> fornecedores = new HashMap<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        
        clientes.put(cliente.getNome(), cliente);
    }

    @Override
    public void adicionarFornecedor(Fornecedor fornecedor) {

        fornecedores.put(fornecedor.getNome(), fornecedor);
    }

    @Override
    public void realizarCompra(Cliente cliente, Fornecedor fornecedor, String produto) {

        if (cliente == null) {
            
            System.out.println("[" + fornecedor.getNome() + "] produto adquirido com sucesso!");
            return;
        }

        System.out.println("[" + cliente.getNome() + "] comprando produto [" + produto + "] do fornecedor [" + fornecedor.getNome() + "]");
        fornecedor.oferecerProduto(produto);
    }
}