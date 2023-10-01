package REGEX;

public class PrintfExample {

    static void employeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n ",
                employee.id, employee.name,employee.surname, employee.salary * (1+ employee.bonus));
    }


    public static void main(String[] args) {

        /**
        *  без синтаксиса как показана ниже:
        *  System.out.printf("string - нужно выровнить по левому краю," +
        *  "а второй параметр double его округлить в int", "hello", "3.4523");
        */


        Employee em1 = new Employee(100,"Qaisar","Baltabayev", 500, 0.49);
        Employee em2 = new Employee(15,"Ivan","Petrov", 340, 0.22);
        Employee em3 = new Employee(4,"Mariya","Smirnova", 350, 0.12);

        employeeInfo(em1);
        employeeInfo(em2);
        employeeInfo(em3);

        /* beautiful output:
        100 	 Qaisar       	 Baltabayev   	 745,0
        015 	 Ivan         	 Petrov       	 414,8
        004 	 Mariya       	 Smirnova     	 392,0
        */

    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonus;


    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }


}
