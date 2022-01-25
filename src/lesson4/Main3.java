package lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру:");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - треугольник");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - трапеция");


        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус круга: ");
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);
            System.out.println("Площадь или окружность?");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (radius * radius)));
            } else {
                System.out.println("Окружность круга: " + (2 * Math.PI * radius));
            }

        } else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {

            System.out.println("Введите полуось A: ");
            String poluOs1Str = scanner.nextLine();
            double poluOs1 = Double.parseDouble(poluOs1Str);

            System.out.println("Введите полуось B: ");
            String poluOs2Str = scanner.nextLine();
            double poluOs2 = Double.parseDouble(poluOs2Str);

            System.out.println("Площадь или окружность?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь овала: " + (Math.PI * poluOs1 * poluOs2));
            } else {
                System.out.println("Окружность овала: " + (Math.PI * (poluOs1 + poluOs2)));
            }

        } else if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {
            // Изменил запрос параметров, в зависимости от того, что надо посчитать
            System.out.println("Площадь или периметр?");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите Высоту: ");
                String visotaStr = scanner.nextLine();
                double visota = Double.parseDouble(visotaStr);

                System.out.println("Введите Основание: ");
                String osnovanieStr = scanner.nextLine();
                double osnovanie = Double.parseDouble(osnovanieStr);

                System.out.println("Площадь треугольника: " + ((visota * osnovanie) / 2));
            } else {
                System.out.println("Введите Основание: ");
                String osnovanieStr = scanner.nextLine();
                double osnovanie = Double.parseDouble(osnovanieStr);

                System.out.println("Введите Сторона A: ");
                String storonaAStr = scanner.nextLine();
                double storonaA = Double.parseDouble(storonaAStr);

                System.out.println("Введите Сторона B: ");
                String storonaBStr = scanner.nextLine();
                double storonaB = Double.parseDouble(storonaBStr);

                System.out.println("Периметр треугольника: " + (osnovanie + storonaA + storonaB));
            }

        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            // Оставил название ссылочных классов сторон как в треугольниках (storonaA/storonsB), так можно?
            System.out.println("Введите Сторона A: ");
            String storonaAStr = scanner.nextLine();
            double storonaA = Double.parseDouble(storonaAStr);

            System.out.println("Введите Сторона B: ");
            String storonaBStr = scanner.nextLine();
            double storonaB = Double.parseDouble(storonaBStr);

            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь прямоугольника: " + (storonaA * storonaB));
            } else {
                System.out.println("Периметр прямоугольника: " + (2 * (storonaA + storonaB)));
            }

        } else if (figura.equals("5") || figura.equalsIgnoreCase("трапеция")) {
            //Здесь тоже что и в треугольниках и прямоугольниках
            System.out.println("Площадь или периметр?");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите Высоту: ");
                String visotaStr = scanner.nextLine();
                double visota = Double.parseDouble(visotaStr);

                System.out.println("Введите Основание A: ");
                String osnovanieAStr = scanner.nextLine();
                double osnovanieA = Double.parseDouble(osnovanieAStr);

                System.out.println("Введите Основание B: ");
                String osnovanieBStr = scanner.nextLine();
                double osnovanieB = Double.parseDouble(osnovanieBStr);

                System.out.println("Площадь трапеции: " + ((osnovanieA + osnovanieB) * (visota / 2)));
            } else {
                System.out.println("Введите Основание A: ");
                String osnovanieAStr = scanner.nextLine();
                double osnovanieA = Double.parseDouble(osnovanieAStr);

                System.out.println("Введите Основание B: ");
                String osnovanieBStr = scanner.nextLine();
                double osnovanieB = Double.parseDouble(osnovanieBStr);

                System.out.println("Введите Сторона C: ");
                String storonaCStr = scanner.nextLine();
                double storonaC = Double.parseDouble(storonaCStr);

                System.out.println("Введите Сторона D: ");
                String storonaDStr = scanner.nextLine();
                double storonaD = Double.parseDouble(storonaDStr);

                System.out.println("Периметр трапеции: " + (osnovanieA + osnovanieB + storonaC + storonaD));
            }

        } else {
            System.out.println("Я не знаю такой фигуры!!!");
        }

    }
}
