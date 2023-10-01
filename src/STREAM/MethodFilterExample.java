package STREAM;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodFilterExample {
    public static void main(String[] args) {
        Student student1 = new Student("Qaisar", 'm', 18, 2, 3.54);
        Student student2 = new Student("Bob", 'm', 20, 4, 2.94);
        Student student3 = new Student("Kate", 'f', 19, 3, 3.67);
        Student student4 = new Student("Zaur", 'm', 19, 3, 3.01);
        Student student5 = new Student("Elena", 'f', 19, 3, 3.62);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students = students.stream().filter(element -> element.getAge() > 18 && element.getGpa() > 3)
                .collect(Collectors.toList());

        System.out.println(students);
    }
}


