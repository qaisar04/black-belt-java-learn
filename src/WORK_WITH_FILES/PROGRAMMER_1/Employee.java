package WORK_WITH_FILES.PROGRAMMER_1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 1;
    public String name;
    public String department;
    public int age;
    transient public double salary;
    public Car car;


    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
