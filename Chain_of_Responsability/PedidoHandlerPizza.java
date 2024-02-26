public class PedidoHandlerPizza extends PedidoHandler {
    
    @Override
    protected boolean podeProcessar(Pedido pedido) {
        return pedido.getTipo().equals("Pizza");
    }

    @Override
    protected void processar(Pedido pedido) {
        System.out.println("Pedido de pizza processado.");
    }
}