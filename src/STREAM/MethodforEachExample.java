package STREAM;

import java.util.Arrays;

public class MethodforEachExample {
    public static void main(String[] args) {
        int[] array = {3, 2, 6, 84, 2, 1, 31};

        // 1
        Arrays.stream(array).forEach(el -> {
            System.out.println(el);
        });

        // 2
        Arrays.stream(array).forEach(el -> System.out.println(el));

        // 3
        Arrays.stream(array).forEach(System.out::println);


    }
}
