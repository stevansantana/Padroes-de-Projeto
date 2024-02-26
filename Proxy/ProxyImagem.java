public class ProxyImagem implements Imagem {
    
    private ImagemReal imagemReal;
    private String arquivo;

    public ProxyImagem(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(arquivo);
        }
        imagemReal.exibir();
    }
}