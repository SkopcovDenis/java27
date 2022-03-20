package lesson11;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("1256");
        texts.add("2154");
        texts.add("8416");
        texts.add("6484");
        texts.add(0,"4444");
        texts.set(0, "!!!!");
        System.out.println(texts);

        // способы прохода по коллекции
        //1 - for (только где есть индексы)
        for (int i = 0; i < texts.size(); i++){
            System.out.println(texts.get(i));
        }

        //2 -  for each (для любой коллекции)
        for (String s: texts){
            System.out.println(s);
        }

       // 3 - с помощью итератора (для любой коллекции)

       for (Iterator<String> iterator = texts.iterator();iterator.hasNext();){
           System.out.println(iterator.next());
       }
    }
}
