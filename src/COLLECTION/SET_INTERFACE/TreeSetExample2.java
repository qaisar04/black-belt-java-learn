package COLLECTION.SET_INTERFACE;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("Kate",2);
        Student st2 = new Student("Loka",3);
        Student st3 = new Student("Bob",3);
        Student st4 = new Student("Ryan",4);
        Student st5 = new Student("Lu",1);

        Student st6 = new Student("Oleg",2);
        Student st7 = new Student("Ivan",4);



        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);


        System.out.println(treeSet);

        System.out.println("---------------------------------------");
        System.out.println(treeSet.first()); // Student{name='Lu', course=1}
        System.out.println(treeSet.last()); // Student{name='Ryan', course=4}
        System.out.println("---------------------------------------");

        System.out.println(treeSet.headSet(st6)); // выведутся те кто по курсу ниже чем st6
        System.out.println(treeSet.tailSet(st6)); // выведутся те кто по курсу выше чем st6 (включительно)

        System.out.println("---------------------------------------");

        System.out.println(treeSet.subSet(st6, st7)); // курс больше или равно студента st6 и меньше чем у st7

        System.out.println("---------------------------------------");


        // a.equals(b) ----> true | a.compareTo(b) -----> 0 (нужно придерживаться такому правилу)

        System.out.println(st4.equals(st7)); // true
        System.out.println(st4.compareTo(st7)); // 0
        System.out.println(st4.hashCode() == st7.hashCode()); // true




    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course - otherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
