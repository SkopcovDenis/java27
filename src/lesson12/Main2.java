package lesson12;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(new Coin(2.5, "Золото", 1900, 100));
        coins.add(new Coin(3.4, "Серебро", 1950, 5));
        coins.add(new Coin(4.5, "Золото", 1930, 15));
        coins.add(new Coin(1.5, "Медь", 1903, 20));
        coins.add(new Coin(2, "Золото", 1901, 10));


        for (Coin coin : coins) {
            System.out.println(coin);
        }

        TreeSet<Coin> sortByDiam = CoinSort.sortByDiametr(coins);
        for (Coin c : sortByDiam) {
            System.out.println(c);
        }

            TreeSet<Coin> sortByDiamFromBigest = CoinSort.sortByDiametrFromBigest(coins);
            for (Coin c : sortByDiamFromBigest) {
                System.out.println(c);
            }

    }
}
