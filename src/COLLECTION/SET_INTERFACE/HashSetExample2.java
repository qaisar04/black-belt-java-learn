package COLLECTION.SET_INTERFACE;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet1 = new HashSet<>();
        integerHashSet1.add(5);
        integerHashSet1.add(2);
        integerHashSet1.add(3);
        integerHashSet1.add(1);
        integerHashSet1.add(8);

        HashSet<Integer> integerHashSet2 = new HashSet<>();
        integerHashSet2.add(7);
        integerHashSet2.add(4);
        integerHashSet2.add(5);
        integerHashSet2.add(3);
        integerHashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(integerHashSet1);
        union.addAll(integerHashSet2); // объединение без дубликатов, так как HashSet только работает с уникальными значениям
        System.out.println(union); // [1, 2, 3, 4, 5, 7, 8]


        HashSet<Integer> intersect = new HashSet<>(integerHashSet1);
        intersect.retainAll(integerHashSet2); // пересечение, то есть общие элементы
        System.out.println(intersect); // [3, 5, 8]

        HashSet<Integer> subtract = new HashSet<>(integerHashSet1);
        subtract.removeAll(integerHashSet2); // вычитание элементов с integerHashSet1 integerHashSet2
        System.out.println(subtract); // [1, 2] | разбор: [1, 2, 3, 5, 8] - [3, 4, 5, 7, 8] = [1, 2]
        // так как элементы [1, 2] во втором отсувствуют
















    }
}
