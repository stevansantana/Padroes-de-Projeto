public class Main {
    
    public static void main(String[] args) {
        Game game = new Game();

        Player player1 = new Player("Alice", game);
        Player player2 = new Player("Bob", game);

        game.setScore(10);
        game.setScore(20);

        System.out.println("A pontuação do jogador " + player1.getName() + " é: " + player1.getScore());
        System.out.println("A pontuação do jogador " + player2.getName() + " é: " + player2.getScore());
    }
}