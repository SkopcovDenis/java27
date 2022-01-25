package lesson3;

public class Main3 {
    // Вывести на консоль только гласные

    public static void main(String[] args) {
        char[] symbols = {'a', 'f', 'e', 'b', 'm', 't', 'o'};
        for (int i = 0; i < symbols.length; i++) {
            // Перечисляем гласные
            if (symbols[i] == 'a' || symbols[i] == 'e' || symbols[i] == 'o') {
                System.out.println(symbols[i]);

            }

        }
    }
}
