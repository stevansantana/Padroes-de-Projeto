
public class LojaOnline extends LojaTemplate {

    @Override
    protected void verificarEstoque(Produto produto) {

        // Verifica se o produto está disponível em estoque
        System.out.println("Verificando estoque do produto " + produto.getNome() + " na loja online...");
    }

    @Override
    protected void calcularPreco(Produto produto) {
        
        // Calcula o preço do produto com base nas regras da loja online
        System.out.println("Calculando preço do produto " + produto.getNome() + " na loja online...");
    }

    @Override
    protected void realizarPagamento(Produto produto) {

        // Realiza o pagamento do produto na loja online
        System.out.println("Realizando pagamento do produto " + produto.getNome() + " na loja online...");
    }

    @Override
    protected void atualizarEstoque(Produto produto) {

        // Atualiza o estoque da loja online após a venda do produto
        System.out.println("Atualizando estoque do produto " + produto.getNome() + " na loja online...");
    }
}
