public class PedidoHandlerSushi extends PedidoHandler {
    
    @Override
    protected boolean podeProcessar(Pedido pedido) {
        return pedido.getTipo().equals("Sushi");
    }

    @Override
    protected void processar(Pedido pedido) {
        System.out.println("Pedido de sushi processado.");
    }
}