package lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 3);
        holodilnik.addProduct("Груша", 4);
        holodilnik.addProduct("Слива", 2);
        holodilnik.addProduct("Яблоко", 4);
        holodilnik.addProduct("Тесто", 4);
        holodilnik.printAllProduct();

        Receipt pirog = new Receipt();
        pirog.setName("Весенний пирог");
        pirog.addIngridients("Яблоко", 2);
        pirog.addIngridients("Груша", 4);
        pirog.addIngridients("Тесто", 3);

        System.out.println(holodilnik.canCook(pirog));
    }
}
