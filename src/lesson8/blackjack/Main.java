package lesson8.blackjack;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();
        Dealler dealler = new Dealler();

        game.addPlayer(player);
        game.addPlayer(dealler);

        game.dealTwoCards();
        game.dealMaxCards();

        game.printWinner();
    }
}
