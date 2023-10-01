package COLLECTION.MAP_INTERFACE;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Qaisar", "Baltabayev", 2);
        Student st2 = new Student("Dariya", "Baltabayeva", 1);
        Student st3 = new Student("Ryan", "Buao", 4);
        Student st4 = new Student("Qaisar", "Baltabayev", 2);

        map.put(st1, 7.5);
        map.put(st2, 8.5);
        map.put(st3, 6.2);

        boolean result = map.containsKey(st4);
        System.out.println(result); // true (без метода hashCode и equals он бы вывел false)

        System.out.println(st1.equals(st4)); // true


        System.out.println(st1.hashCode()); // -320653989
        System.out.println(st2.hashCode()); // 1490767340
        System.out.println(st4.hashCode()); // -320653989


    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
