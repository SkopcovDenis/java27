package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = 6;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедеренный треугольник");
        }


    }
}
