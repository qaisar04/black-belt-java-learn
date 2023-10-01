package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Q");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("R");
        arrayList.add("I");

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            // с помощью iterator.next() мы получаем элемент
            // c помощью iterator,remove() мы можем его удалить

            if(iterator.next() == "R") {
                iterator.remove();
            }

           // System.out.println(iterator.next());
        }

        System.out.println(arrayList);






    }
}
