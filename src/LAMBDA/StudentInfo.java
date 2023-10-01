package LAMBDA;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {


        Student student1 = new Student("Qaisar", 'm', 18, 2, 3.54);
        Student student2 = new Student("Bob", 'm', 20, 4, 2.94);
        Student student3 = new Student("Kate", 'f', 19, 3, 3.67);
        Student student4 = new Student("Zaur", 'm', 19, 3, 3.01);
        Student student5 = new Student("Elena", 'f', 19, 3, 3.62);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentOverGrade(students, 3);
//        System.out.println("_____________________________");
//        studentInfo.printStudentUnderAge(students,20);
        System.out.println("_____________________________");


        // 1
        studentInfo.TestStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age > 19;
            }
        });

        System.out.println("_____________________________");

        // 2
        studentInfo.TestStudents(students, (Student s) -> {
            return s.age > 19;
        });

        // 3
        studentInfo.TestStudents(students, s -> s.age > 19);



    }

    void TestStudents(ArrayList<Student> students, StudentChecks studentChecks) {
        for (Student s : students) {
            if (studentChecks.check(s)) {
                System.out.println(s);
            }
        }
    }

    void printStudentOverGrade(ArrayList<Student> students, double grade) {
        // вывод студентов у кого gpa больше grade
        for (Student s : students) {
            if (s.gpa > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> students, int age) {
        // искать студентов до какого то возвраста
        for (Student s : students) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.gpa > 0;
    }
}

