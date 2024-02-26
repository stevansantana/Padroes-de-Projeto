public class Main {
    
    public static void main(String[] args) {
        PedidoHandlerPizza handlerPizza = new PedidoHandlerPizza();
        PedidoHandlerSushi handlerSushi = new PedidoHandlerSushi();
        PedidoHandlerBebida handlerBebida = new PedidoHandlerBebida();

        handlerPizza.setProximoHandler(handlerSushi);
        handlerSushi.setProximoHandler(handlerBebida);

        Pedido pedido1 = new Pedido("Pizza");
        Pedido pedido2 = new Pedido("Sushi");
        Pedido pedido3 = new Pedido("Bebida");
        Pedido pedido4 = new Pedido("Hamburguer");

        handlerPizza.processarPedido(pedido1);
        handlerPizza.processarPedido(pedido2);
        handlerPizza.processarPedido(pedido3);
        handlerPizza.processarPedido(pedido4);
    }
}