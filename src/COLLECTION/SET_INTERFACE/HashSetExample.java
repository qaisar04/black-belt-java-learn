package COLLECTION.SET_INTERFACE;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // хранятся только уникальные элементы

        // HashSet не запоминает порядок добавление элементов

        set.add("Zaur");
        set.add("Qaisar");
        set.add("Ryan");
        set.add("Beop");
        set.add("Kate");


        System.out.println(set); // [Ryan, Kate, Qaisar, Beop, Zaur]

        for(String s : set) {
            System.out.println(s);
        }

        set.remove("Kate"); // удаление

        System.out.println(set.size()); // 4

        System.out.println(set.isEmpty()); // false так как не пустой

        System.out.println(set.contains("Sasha")); // false так как нет такого элемента






    }
}
