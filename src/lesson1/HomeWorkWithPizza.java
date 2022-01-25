package lesson1;

public class HomeWorkWithPizza {
    public static void main(String[] args) {
        //Данные
        int cash = 1000;
        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        //Сколько купим пицц
        int zakupkaPizza;
        zakupkaPizza = cash / pizza;

        //Остаток денег,после покупки пиццы
        int ostatokPoslePizzy;
        ostatokPoslePizzy = cash % pizza;

        //Стоимость купленной пиццы
        int summaPizza = pizza * zakupkaPizza;

        //Сколько купим жевачки
        int zakupkaGum;
        zakupkaGum = ostatokPoslePizzy / gum;

        //Остаток денег,после покупки жевачки
        int ostatokPosleGum;
        ostatokPosleGum = ostatokPoslePizzy % gum;

        //Стоимость купленной жевачки
        int summaGum = gum * zakupkaGum;

        //Сколько купим конфет
        double zakupkaCandy = ostatokPosleGum / candy;
        zakupkaCandy = (int) (zakupkaCandy);

        //Стоимость купленных конфет
        double summaCandy = candy * zakupkaCandy;
        summaCandy = (int) summaCandy;

        //Сдача
        double change;
        change = cash - summaPizza - summaGum - summaCandy;

        System.out.println("На эти деньги мы можем купить:");
        System.out.println(zakupkaPizza + " Пиццы");
        System.out.println(zakupkaGum + " Жвачки");
        System.out.println(zakupkaCandy + " Конфеты");
        System.out.println("Сдача с магазина " + change);
    }
}
