package lesson8.blackjack;

import java.util.ArrayList;

public class Game implements IGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Koloda koloda = new Koloda();

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void dealTwoCards() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());
        }

    }

    @Override
    public void dealMaxCards() {
        for (Player p : players) {
            while (p.needsCard()) {
                p.addCardToHand(koloda.getRandomCard());
            }
        }

    }

    @Override
    public void printWinner() {
        for (Player p : players) {
            if (p.valuesHand() > 21) {
                p.setCanWin(false);
            }
        }
        if (countPlayersCanWin() == 0) {
            for (Player p : players) {
                if (p instanceof Dealler) {
                    System.out.println("Победитель крупье!");
                    p.openCards();
                    return;
                }
            }
        }
        if (countPlayersCanWin() == 1) {
            for (Player p : players) {
                if (p.isCanWin()) {
                    System.out.println("Победитель!");
                    p.openCards();
                    return;
                }
            }
        }

        int valueWinner = -1;
        for (Player p : players) {
            if (p.isCanWin() && p.valuesHand() > valueWinner) {
                valueWinner = p.valuesHand();
            }
        }

        for (Player p : players) {
            if (p.isCanWin() && p.valuesHand() == valueWinner) {
                System.out.println("Победитель!");
                p.openCards();
            }
        }

    }

    private int countPlayersCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
