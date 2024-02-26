public class Main {
    
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemotoPadrao();
        Televisao tvSala = new TelevisaoSala(controle);

        tvSala.ligar();
        tvSala.sintonizarCanal(5);
        tvSala.desligar();
    }
}