package STREAM;

import java.util.ArrayList;
import java.util.List;

public class MethodFindFirstExample {
    public static void main(String[] args) {
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

        Student first = students.stream().map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                }).filter(e -> e.getSex() == 'f')
                .sorted((x,y) -> (x.getAge() - y.getAge()))
                .findFirst()
                .get();

        System.out.println(first); // Student{name='KATE', sex=f, age=19, course=3, gpa=3.67}

    }
}
