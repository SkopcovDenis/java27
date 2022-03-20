package lesson6;

public class DZSlovaNaoborot {
    /**
     * Разобрали на занятии
     * Мы передаем Текст, метод печатает на консоль этот же текст,
     * только КАЖДОЕ слово наоборот будет напечатано ***
     * (метод сложный, делают только те кто в себе уверен)
     */
    public static void reverseWords(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }
    }
}
