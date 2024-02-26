public class Main {

    public static void main(String[] args) {
        
        ProxyImagem proxy = new ProxyImagem("imagem.jpg");
        Cliente cliente = new Cliente(proxy);

        cliente.exibirImagem(); // Chamada do método através do proxy
    }
}