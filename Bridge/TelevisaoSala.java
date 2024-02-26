public class TelevisaoSala extends Televisao {
    
    public TelevisaoSala(ControleRemoto controle) {
        super(controle);
    }

    @Override
    public void ligar() {
        controle.ligar();
        System.out.println("Ligando a televisão da sala");
    }

    @Override
    public void desligar() {
        controle.desligar();
        System.out.println("Desligando a televisão da sala");
    }

    @Override
    public void sintonizarCanal(int canal) {
        controle.sintonizarCanal(canal);
        System.out.println("Sintonizando canal " + canal + " na televisão da sala");
    }

    @Override
    public void info() {
        System.out.println("Televisão da sala");
    }
}