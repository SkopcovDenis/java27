package lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {5, 5, 8, 4, 3, 1, 7};
        int sumChetnih = 0;
        for (int i = 0; i < 6; i++) {
            if (numbers[i] % 2 == 0) {
                sumChetnih = sumChetnih + numbers[i];
            }
        }
        System.out.println(sumChetnih);
    }
}
