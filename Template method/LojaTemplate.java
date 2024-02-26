
public abstract class LojaTemplate {

    public final void realizarVenda(Produto produto) {

        verificarEstoque(produto);
        calcularPreco(produto);
        realizarPagamento(produto);
        atualizarEstoque(produto);
        emitirNotaFiscal(produto);
    }

    protected abstract void verificarEstoque(Produto produto);
    protected abstract void calcularPreco(Produto produto);
    protected abstract void realizarPagamento(Produto produto);
    protected abstract void atualizarEstoque(Produto produto);

    protected void emitirNotaFiscal(Produto produto) {
        System.out.println("Emitindo nota fiscal para " + produto.getNome());
    }
}

    