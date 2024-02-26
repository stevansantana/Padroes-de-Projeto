
public class Main {

    public static void main(String[] args) {

        ControleXbox controleXbox = new ControleXboxImpl();
        ControleJogo controleJogo = new ControleXboxAdapter(controleXbox);
        
        controleJogo.pressionarBotaoA();
        controleJogo.pressionarBotaoB();
        controleJogo.pressionarBotaoX();
        controleJogo.pressionarBotaoY();
    }
}