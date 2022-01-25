package lesson3;

public class homework0801 {
    public static void main(String[] args) {
        // 1. Напечатать на консоль ячейки всего массива
        System.out.println("Напечатать на консоль ячейки всего массива");
        int[] numbers = {5, 7, 8, 6, 4, 9, 1, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 3 Напечатать на консоль сумму значений всех ячеек
        System.out.println("Напечатать на консоль сумму значений всех ячеек");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        // 2. Напечатать на консоль ячейки всего массива c конца в начало
        System.out.println("Напечатать на консоль ячейки всего массива c конца в начало");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        // 4. Напечатать на консоль кого в массиве больше, четных или нечетных
        System.out.println("Напечатать на консоль кого в массиве больше, четных или нечетных");
        int sumChetnih = 0;
        int sumNechetnih = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumChetnih++;
            } else {
                sumNechetnih++;
            }
        }
        if (sumChetnih > sumNechetnih) {
            System.out.println("Четных больше");
        }else{
            System.out.println("Нечетных больше");
        }
    }
}
