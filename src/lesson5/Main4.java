package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"Куба", "5 дней", "самолет", "5 звезд", "120000"},
                            {"Куба", "14 дней", "автобус", "4 звезд", "220000"},
                            {"Куба", "7 дней", "самолет", "3 звезд", "100000"},
                            {"Куба", "10 дней", "поезд", "4 звезд", "180000"},
                            {"Куба", "12 дней", "самолет", "5 звезд", "200000"}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну вы хотите поехать?");

        String country = scanner.nextLine();

        System.out.println("У нас есть такие предложения в " + country);

        for (int i = 0; i < tours.length; i++){
            if (country.equalsIgnoreCase(tours[i][0])){
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ". " + tours[i][2] + ". "
                        + tours[i][3] + ". цена - "  + tours[i][4]);

            }

        }
        System.out.println("Сколько максимум дней для поездки?");
        String dayStr = scanner.nextLine();

        int day = Integer.parseInt(dayStr);
        for (int i = 0; i < tours.length; i++){
           int dayFromTour = Integer.parseInt(tours[i][1].replaceAll("[\\D]", ""));
           if(dayFromTour <= day){
               System.out.println(tours[i][0] + ", на " + tours[i][1] + ". " + tours[i][2] + ". "
                       + tours[i][3] + ". цена - "  + tours[i][4]);

           }
        }
        //1. все туры ОТ и ДО введенной цены
        System.out.println("На какую минимальную сумму рассчитываете?");
        String moneyMinStr = scanner.nextLine();
        int moneyMin = Integer.parseInt(moneyMinStr);
        System.out.println("На какую максимальную сумму рассчитываете?");
        String moneyMaxStr = scanner.nextLine();
        int moneyMax = Integer.parseInt(moneyMaxStr);

        for (int i = 0; i < tours.length; i++) {
            int moneyForTour = Integer.parseInt(tours[i][4].replaceAll("[\\D]", ""));
            if (moneyForTour <= moneyMax && moneyForTour >= moneyMin) {
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ", " + tours[i][2] + ", "
                        + tours[i][3] + ", цена - " + tours[i][4]);
            }
        }
        //2 Средняя цена тура в вашем агенстве
        int sumPrice = 0;
        int costPrice = 0;

        for (int i = 0; tours.length <= 0; i++){


        }

        //3. Туры от ... звезд и выше
        System.out.println("От скольки звезд отель?");
        String starsStr = scanner.nextLine();
        int stars = Integer.parseInt(starsStr);

        for (int i = 0; i < tours.length; i++) {
            int starsForTour = Integer.parseInt(tours[i][3].replaceAll("[\\D]", ""));
            if (starsForTour >= stars) {
                System.out.println(tours[i][0] + ", на " + tours[i][1] + ", " + tours[i][2] + ", "
                        + tours[i][3] + ", цена - " + tours[i][4]);
            }
        }
        //вывести на консоль
        //1 все туры ОТ и ДО введенной цены
        //2 среднюю цену тура в вашем агенстве
        //3 туры от ... звезд и выше
    }
}
