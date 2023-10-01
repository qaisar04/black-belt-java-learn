package STREAM;

import java.util.ArrayList;
import java.util.List;

public class MethodFlatMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Lana", 'm', 18, 2, 3.54);
        Student st2 = new Student("Bob", 'm', 20, 4, 2.94);
        Student st3 = new Student("Kate", 'f', 19, 3, 3.67);
        Student st4 = new Student("Zaur", 'm', 19, 3, 3.01);
        Student st5 = new Student("Elena", 'f', 19, 3, 3.62);

        Faculty f1 = new Faculty("FIT");
        Faculty f2 = new Faculty("Economics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));


    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}
