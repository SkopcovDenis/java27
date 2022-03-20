package lesson6;

public class DZMetodiSlova1 {
    /**
     * Разобрали на занятии
     * Мы передаем в метод текст,
     * а он нам возвращает кол-во слов (числом)
     */
    public static void countWordsInText(String text) {
        int count = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
