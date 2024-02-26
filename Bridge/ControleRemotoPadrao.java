public class ControleRemotoPadrao implements ControleRemoto {
    
    @Override
    public void ligar() {
        System.out.println("Ligando o controle remoto padrão");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o controle remoto padrão");
    }

    @Override
    public void sintonizarCanal(int canal) {
        System.out.println("Sintonizando canal " + canal + " no controle remoto padrão");
    }
}