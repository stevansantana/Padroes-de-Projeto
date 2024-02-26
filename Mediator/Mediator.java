
public interface Mediator {
    
    void adicionarCliente(Cliente cliente);
    void adicionarFornecedor(Fornecedor fornecedor);
    void realizarCompra(Cliente cliente, Fornecedor fornecedor, String produto);
}