package lesson2;

public class DZ1 {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaCost = 230;
        int bubleCost = 26;
        double candyCost = 2.5;

        int canBuyPizza = money/pizzaCost;
        money= money-(pizzaCost*canBuyPizza);

        int canBuyBuble = money / bubleCost;
        money = money-(bubleCost*canBuyBuble);

        int canBuyCandy =(int) (money / candyCost);
        double change = money - (canBuyCandy * candyCost);

        System.out.println("Пицц:" + canBuyPizza);
        System.out.println("Жвачки:" + canBuyBuble);
        System.out.println("Конфеты:" + canBuyCandy);
        System.out.println("Сдача:" + change);

    }
}
