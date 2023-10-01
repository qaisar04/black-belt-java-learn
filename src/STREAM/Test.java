package STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Bob");
        list.add("Moon");
        list.add("Bye");
        list.add("Kate");


        List<Integer> integerList = list.stream().map(element -> element.length())
                .collect(Collectors.toList());


        int[] array = {2, 3, 6, 7, 9, 12, 10};

        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

    }
}
