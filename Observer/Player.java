class Player implements GameObserver {

    private String name;
    private int score;

    public Player(String name, Game game) {
        this.name = name;
        game.registerObserver(this);
    }

    public void update(GameSubject subject) {
        if (subject instanceof Game) {
            Game game = (Game) subject;
            score = game.getScore();
            System.out.println("O jogador " + name + " recebeu a atualização do jogo: pontuação atual: " + score);
        }
    }

     public int getScore() {
        return score;
    }
}