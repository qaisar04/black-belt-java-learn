package STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodMapToIntExample {
    public static void main(String[] args) {

        Student st1 = new Student("Lana", 'm', 18, 2, 3.54);
        Student st2 = new Student("Bob", 'm', 20, 4, 2.94);
        Student st3 = new Student("Kate", 'f', 21, 4, 3.67);
        Student st4 = new Student("Zaur", 'm', 23, 5, 3.01);
        Student st5 = new Student("Elena", 'f', 19, 3, 3.62);
        Student st6 = new Student("Laso", 'm', 22, 3, 3.69);


        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        List<Integer> list =
                students.stream().mapToInt(el -> el.getCourse())
                        .boxed()
                        .collect(Collectors.toList());

        // int --> Integer (метод boxed)
        // для типов double mapToDouble

        System.out.println(list);


        // суммируем все возврасты между собой
        int num = students.stream().mapToInt(el -> el.getAge()).sum();
        System.out.println(num); // 123

        double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average); // 3.5

        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min); // 2

        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max); // 5

    }
}
