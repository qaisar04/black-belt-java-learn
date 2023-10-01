package STREAM;

import java.util.stream.Stream;

public class MethodCountExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 3, 6, 4, 5, 5, 0, 8, 3);
//      System.out.println(stream.count()); // сколько элементов содержит stream
        System.out.println(stream.distinct().count()); // сколько уникальных элементов содержит stream
    }
}
