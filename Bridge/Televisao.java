public abstract class Televisao {
    
    protected ControleRemoto controle;

    public Televisao(ControleRemoto controle) {
        this.controle = controle;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void sintonizarCanal(int canal);
    public abstract void info();
}