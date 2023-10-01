package STREAM;

import java.util.ArrayList;
import java.util.List;

public class MethodMinMaxLimitSkipExample {
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


        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min); // age=18
        System.out.println("_______________________________");

        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(max); // age=23
        System.out.println("_______________________________");


        // фильтруем и выводим всех студентов кто прошел фильтрацию
        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
        System.out.println("_______________________________");

        // фильтруем и выводим только 2 студентов так как стоит метод limit
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("_______________________________");

        // фильтруем и пропускаем первых 2 студентов
        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
        System.out.println("_______________________________");


    }
}
