package lesson14;

import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpl<String, String> telContacts = new MultiMapImpl<>();

        System.out.println(telContacts.countValues("Василий"));

        telContacts.put("Василий", "+79264518192");
        telContacts.put("Саша", "+79264468192");
        telContacts.put("Таня", "+79264588192");
        telContacts.put("Денис", "+79264518992");
        telContacts.put("Василий", "+79264518492");

//        for (Iterator<String> iter = telContacts.valuesIterator("Василий"); iter.hasNext();){
//            System.out.println(iter.next());
//        }
//        for (String tel:telContacts.values()){
//            System.out.println(tel);
//        }
        System.out.println(telContacts.get("Василий"));
    }
}
