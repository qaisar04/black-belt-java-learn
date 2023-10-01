package STREAM;

import java.util.stream.Stream;

public class MethodConcatExample {
    public static void main(String[] args) {
        Stream stream1 = Stream.of(1, 6, 4, 2, 1, 0);
        Stream stream2 = Stream.of(0, 3, 1, 5, 5, 9);

        Stream stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);


    }
}
