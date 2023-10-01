package LAMBDA;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double gpa;

    public Student(String name, char sex, int age, int course, double gpa) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", gpa=" + gpa +
                '}';
    }
}
