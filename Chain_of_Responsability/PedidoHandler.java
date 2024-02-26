public abstract class PedidoHandler {

    private PedidoHandler proximoHandler;

    public void setProximoHandler(PedidoHandler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }

    public void processarPedido(Pedido pedido) {
        if (podeProcessar(pedido)) {
            processar(pedido);
        } else if (proximoHandler != null) {
            proximoHandler.processarPedido(pedido);
        } else {
            System.out.println("Nenhum handler pode processar o pedido.");
        }
    }

    protected abstract boolean podeProcessar(Pedido pedido);

    protected abstract void processar(Pedido pedido);
}