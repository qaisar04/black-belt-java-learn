package STREAM;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        // в данном случае parallelStream не стоит использовать это лишь усгубит скорость, но это лишь для примера
        double sumResult = list.parallelStream()
                .reduce((a, e) -> a + e).get();

        System.out.println(sumResult); // 16.25


        // в данном случае результат будет другим так как порядок элементов важен
        double divisionResult = list.parallelStream()
                .reduce((a, e) -> a / e).get();
        System.out.println(divisionResult);
    }
}
