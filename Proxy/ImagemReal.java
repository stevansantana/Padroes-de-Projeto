public class ImagemReal implements Imagem {

    private String arquivo;

    public ImagemReal(String arquivo) {
        this.arquivo = arquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando imagem do disco: " + arquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem: " + arquivo);
    }
}

