package homework2512;

public class HomeWork20to40 {

    public static void main(String[] args) {
        //вывести на консоль сумму четных чисел от 20 до 40
        int sum = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}

