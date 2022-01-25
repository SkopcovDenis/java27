package homework2512;

public class HomeWork0to100 {
    public static void main(String[] args) {
        //вывести на консоль среднее значение всех нечетных чисел от 0 до 100
        int countNechetnoe = 0;
        int sumN = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                sumN += i;
                countNechetnoe++;
            }

        }
        System.out.println(sumN / countNechetnoe);
    }
}
