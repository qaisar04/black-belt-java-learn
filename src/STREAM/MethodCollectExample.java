package STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodCollectExample {
    public static void main(String[] args) {
        Student st1 = new Student("Anna", 'm', 18, 2, 3.54);
        Student st2 = new Student("Bob", 'm', 20, 4, 2.94);
        Student st3 = new Student("Kate", 'f', 19, 3, 3.67);
        Student st4 = new Student("Zaur", 'm', 19, 3, 3.01);
        Student st5 = new Student("Elena", 'f', 19, 3, 3.62);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // groupingBy
        Map<Integer, List<Student>> map = students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }) // меняем имя на заглавные
                .collect(Collectors.groupingBy(el -> el.getCourse())); // группировака по курсу

        // ключ хешмапа курс а значение студенты данного курса
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        System.out.println("---------------------------------------");


        // partitioningBy
        Map<Boolean, List<Student>> map2 =
                students.stream()
                        .collect(Collectors.partitioningBy(el -> el.getGpa() > 3));

        // ключ хешмапа курс а значение студенты данного курса
        for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
