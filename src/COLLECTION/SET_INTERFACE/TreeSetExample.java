package COLLECTION.SET_INTERFACE;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet хранит элементы в отсортированном по возврастанию порядке.
        // В основе TreeSet лежит TreeMap. key - элементы TreeSet, value - константа-заглушка

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
//        treeSet.add(null); -- NullPointerException

        System.out.println(treeSet); // [1, 2, 5, 8, 10]

        treeSet.remove(2);

        treeSet.contains(10); // true



    }
}
