package lesson5;
//Дома поправь
public class Main1 {
    public static void main(String[] args) {
        int money = 1000000;
        int year = 5;
        int prosent = 7;

        for (int i = 0; i < year; i++){
            for (int month = 0; month < 12; month++){
                money = money + ((money/100*prosent)/12);
            }
        }
        System.out.println("Ежемесячная - " + money);

        for (int i = 0; i < year; i++){
            money = money + ((money/100*prosent));
        }
        System.out.println("Годовой - " + money );
    }
}
