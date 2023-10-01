package COMPARATION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class implementsComparator {
    public static void main(String[] args) {
        List empList = new ArrayList<>();
        Employees emp1 = new Employees(100,"Qaisar","Baltabayev",12423);
        Employees emp2 = new Employees(345,"Aloa","Loa",8234);
        Employees emp3 = new Employees(45,"Loas","Loasdk",345534);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println("Before sorting:\n" + empList);

//        Collections.sort(empList, new IdComparator());
        Collections.sort(empList, new NameComparator());
        System.out.println("After sorting:\n" + empList);

    }

}

/**  Интерфейс Comparable используется для сравнения
*    обьектов, используя естественный порядок.
* */

class Employees {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employees(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// сортировка по id
class IdComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees emp1, Employees emp2) {
        if(emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

// сортировка по name
class NameComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees emp1, Employees emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

// сортировка по salary
class SalaryComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees emp1, Employees emp2) {
        return emp1.salary-emp2.salary;
    }
}
