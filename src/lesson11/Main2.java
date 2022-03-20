package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long strartTimeArrayAdd = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            arrayList.add(i + "оыаыпоо");
        }

        long endTimeArrayAdd = System.currentTimeMillis();
        System.out.println("ArrayList add:" + (endTimeArrayAdd - strartTimeArrayAdd));

        long strartTimeLinkedAdd = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            linkedList.add(i + "оыаыпоо");
        }
        long endTimeLinkedAdd = System.currentTimeMillis();
        System.out.println("LinkedList add:" + (endTimeLinkedAdd - strartTimeLinkedAdd));


        long strartTimeArrayGet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            arrayList.get(i);
        }

        long endtTimeArrayGet = System.currentTimeMillis();
        System.out.println("ArrayList get:" + (endtTimeArrayGet - strartTimeArrayGet));

        long strartTimeLinkedGet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            linkedList.get(i);
        }

        long endTimeLinkedGet = System.currentTimeMillis();
        System.out.println("LinkedList get:" + (endTimeLinkedGet - strartTimeLinkedGet));
    }
}
