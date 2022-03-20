package lesson6;

public class DZMetodSoglasnie {
    public static int countSoglasnFromText(String text) {
        /**
         * Мы передаем текст,
         * нужно напечатать на консоль сколько в нем согласных букв
         */
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'q' || text.charAt(i) == 'w'
                    || text.charAt(i) == 'r' || text.charAt(i) == 't'
                    || text.charAt(i) == 'p' || text.charAt(i) == 's'
                    || text.charAt(i) == 'd' || text.charAt(i) == 'f'
                    || text.charAt(i) == 'g' || text.charAt(i) == 'h'
                    || text.charAt(i) == 'j' || text.charAt(i) == 'k'
                    || text.charAt(i) == 'l' || text.charAt(i) == 'z'
                    || text.charAt(i) == 'x' || text.charAt(i) == 'c'
                    || text.charAt(i) == 'v' || text.charAt(i) == 'b'
                    || text.charAt(i) == 'n' || text.charAt(i) == 'm') {
                count++;
            }
        }
        return count;
    }
}
