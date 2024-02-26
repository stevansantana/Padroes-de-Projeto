public class Cliente {

    private Imagem imagem;

    public Cliente(Imagem imagem) {
        this.imagem = imagem;
    }

    public void exibirImagem() {
        imagem.exibir();
    }
}