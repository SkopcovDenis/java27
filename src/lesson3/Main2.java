package lesson3;

public class Main2 {
    public static void main(String[] args) {
        //Вывести ячейки с конца через одну
        int[] numbers = {2, 6, 7, 5, 3, 4, 1};
        for (int i = 6; i > 1; i = i - 2) {
            //System.out.println(Numbers[6]);
            // System.out.println(Numbers[4]);
            // System.out.println(Numbers[2]);

            System.out.println(numbers[i]);
        }
    }
}
