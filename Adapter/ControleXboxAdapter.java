
public class ControleXboxAdapter implements ControleJogo {

    private ControleXbox controleXbox;

    public ControleXboxAdapter(ControleXbox controleXbox) {

        this.controleXbox = controleXbox;
    }

    @Override
    public void pressionarBotaoA() {

        controleXbox.botaoA();
    }

    @Override
    public void pressionarBotaoB() {

        controleXbox.botaoB();
    }

    @Override
    public void pressionarBotaoX() {

        controleXbox.botaoX();
    }

    @Override
    public void pressionarBotaoY() {
        
        controleXbox.botaoY();
    }
}