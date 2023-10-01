package STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReduceExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(10);
        list.add(2);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element)
                .get();

        System.out.println(result);

        // 5 1 2 6 10 2
        // accumulator: 5  5  10  60  600  1200
        //     element: 1  2  6   10  2


        int result1 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result1);
        // 5 1 2 6 10 2
        // accumulator: 1 5 10 60 600 1200
        //     element: 5 2 6  10 2


        // что такой Optional, который возвращает метод reduce:
        // reduce возвращает Optional, чтобы предоставить безопасный способ вернуть результат, когда коллекция пуста.
        // Использование Optional и метода reduce способствует более безопасной и чистой обработке
        // отсутствующих значений и предоставляет возможность избежать проверок на null в вашем коде

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> result2 = list2.stream().reduce((accumulator, element) -> accumulator * element);

        if(result2.isPresent()) {
            System.out.println(result2.get());
        } else {
            System.out.println("not present");
        }






    }
}
