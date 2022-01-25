package lesson3;

public class Main7 {
    public static void main(String[] args) {
        //создать масив такой же длины
        int[] numbers = {5, 2, 6, 8, 4,};
        int[] sum = new int[numbers.length];
        //sum[0]=numbers[0]+numbers[1];
        //sum[1]=numbers[0]+numbers[1]+numbers[2];
        //sum[2]=numbers[1]+numbers[2]+numbers[3];
        //sum[3]=numbers[2]+numbers[3]+numbers[4];
        //sum[4]=numbers[3]+numbers[4];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                sum[0] = numbers[0] + numbers[1];
            } else if (i == numbers.length - 1) {
                sum[numbers.length - 1] = numbers[numbers.length - 2] + numbers[numbers.length - 1];
            } else {
                sum[i] = numbers[i - 1] + numbers[i] + numbers[i + 1];
            }
        }
        System.out.println();

    }
}
