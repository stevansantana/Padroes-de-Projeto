public class PedidoHandlerBebida extends PedidoHandler {
    
    @Override
    protected boolean podeProcessar(Pedido pedido) {
        return pedido.getTipo().equals("Bebida");
    }

    @Override
    protected void processar(Pedido pedido) {
        System.out.println("Pedido de bebida processado.");
    }
}