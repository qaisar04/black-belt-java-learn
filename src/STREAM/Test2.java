package STREAM;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 3, 3, 134, 6, 7, 1, 5, 6, 13);
        stream.filter(el -> {
            System.out.println("!!!");
            return el % 2 == 0;
        }).collect(Collectors.toList());


    }
}
