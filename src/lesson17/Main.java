package lesson17;

import lesson16.CopyUsingChannel;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithApache copyWithApache = new CopyWithApache();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        CopyUsingChannel copyUsingChannel = new CopyUsingChannel();
        CopyUsingStream copyUsingStream = new CopyUsingStream();


        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\vocpa\\Downloads\\К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012 .djvu", "1.djvu");
        long end1 = System.currentTimeMillis();
        System.out.println("Копиронвание с IO: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\vocpa\\Downloads\\К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012 .djvu", "2.djvu");
        long end2 = System.currentTimeMillis();
        System.out.println("Копиронвание с NIO: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        copyWithApache.copy("C:\\Users\\vocpa\\Downloads\\К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012 .djvu", "3.djvu");
        long end3 = System.currentTimeMillis();
        System.out.println("Копиронвание с Apache: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        copyWithGuava.copy("C:\\Users\\vocpa\\Downloads\\К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012 .djvu", "4.djvu");
        long end4 = System.currentTimeMillis();
        System.out.println("Копиронвание с Guava: " + (end4 - start4));

        long start5 = System.currentTimeMillis();
        copyUsingChannel.copy("C:\\Users\\vocpa\\Downloads\\К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012 .djvu", "5.djvu");
        long end5 = System.currentTimeMillis();
        System.out.println("Копиронвание с UsingChanel: " + (end5 - start5));

        long start6 = System.currentTimeMillis();
        copyUsingStream.copy("C:\\Users\\vocpa\\Downloads\\К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012 .djvu", "6.djvu");
        long end6 = System.currentTimeMillis();
        System.out.println("Копиронвание с UsingStream: " + (end6 - start6));
    }
}
