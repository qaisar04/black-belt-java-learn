package STREAM;

import java.util.stream.Stream;

public class MethodDistinctExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 3, 6, 4, 5, 5, 0, 8, 3);
        stream.distinct().forEach(System.out::println); // выводит уникальные элементы.
    }
}
