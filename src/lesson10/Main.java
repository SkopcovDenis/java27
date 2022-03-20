package lesson10;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        figuras[0] = new Circle(12);
        figuras[1] = new Elipse(12, 6);
        figuras[2] = new Triangle(3, 5, 8);
        figuras[3] = new Square(12);
        figuras[4] = new Rectangle(12, 8);

        // быстрый проход по массиву for each

        for(Figura f:figuras){
            System.out.println("--------");
            System.out.println(f);
            System.out.println(f.perimetr()); //проявление полиморфизма
        }
    }
}
