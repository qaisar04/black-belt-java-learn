package STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStartWrite {
    public static void main(String[] args) {
//      creating a stream from scratch
        Student st1 = new Student("Lana", 'm', 18, 2, 3.54);
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

        Stream<Student> studentStream = Stream.of(st1, st2, st3, st4, st5);

        studentStream.filter(element -> element.getAge() > 18 && element.getGpa() > 3)
                .collect(Collectors.toList());
    }
}
