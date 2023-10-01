package COMPARATION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class interfaceComparable {
    public static void main(String[] args) {
        List empList = new ArrayList<>();
        Employee emp1 = new Employee(100,"Qaisar","Baltabayev",12423);
        Employee emp2 = new Employee(345,"Aloa","Loa",8234);
        Employee emp3 = new Employee(45,"Loas","Loasdk",345534);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println("Before sorting:\n" + empList);

        Collections.sort(empList);
        System.out.println("After sorting:\n" + empList);

    }

}

/**  Интерфейс Comparable используется для сравнения
*    обьектов, используя естественный порядок.
* */

class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {

//       if(this.id == anotherEmp.id) {
//           return 0;
//       } else if (this.id < anotherEmp.id) {
//           return -1;
//       } else {
//           return 1;
//       }

//       return this.id - anotherEmp.id;
//       return this.id.compareTo(anotherEmp.id); // сортировка по айди
        int result = this.name.compareTo(anotherEmp.name);  // сортировка по имени
        if(result == 0) {
            result = this.surname.compareTo(anotherEmp.surname); // сортировка по фамилии
        }
        return result;

    }
}