package STREAM;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodSortedExample {
    public static void main(String[] args) {
        int[] array = {1, 5, 0, 7, 34, 123, 745, 22, 12};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array)); // [0, 1, 5, 7, 12, 22, 34, 123, 745]

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

        students = students.stream().sorted((x,y) ->
                x.getName().compareTo(y.getName())
                ).toList(); // в параметрах sorted пишем comparator
        System.out.println(students);
    }
}
