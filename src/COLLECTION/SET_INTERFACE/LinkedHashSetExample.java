package COLLECTION.SET_INTERFACE;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // использовать LinkedHashSet тогда когда нужен HashSet но который запоминает последовательность добавление элементов
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);

        System.out.println(linkedHashSet); // [5, 3, 1, 8, 10] - последовательность добавление элементов сохраняется

    }
}
