package COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(-4);
        arrayList.add(-5);
        arrayList.add(3);
        arrayList.add(235);
        arrayList.add(912);
        arrayList.add(-12);
        arrayList.add(-102);
        arrayList.add(323);
        arrayList.add(91);
        arrayList.add(69);
        arrayList.add(-43);
        arrayList.add(-2);
        arrayList.add(-8);


        Collections.sort(arrayList); // [-102, -43, -12, -8, -5, -4, -2, 3, 69, 91, 235, 323, 912] -- сортировка


        int index = Collections.binarySearch(arrayList, 69);
        System.out.println(index);

        Collections.reverse(arrayList); // [912, 323, 235, 91, 69, 3, -2, -4, -5, -8, -12, -43, -102] -- после сортировки сделали реверс
        Collections.shuffle(arrayList); // [91, -43, -4, 3, -2, 69, -102, 323, 235, -5, -12, -8, 912] -- все как попало



        Employee emp1 = new Employee(334,"Qaisar",23423);
        Employee emp2 = new Employee(2,"Zaur",10000);
        Employee emp3 = new Employee(90,"Alishev",5023);
        Employee emp4 = new Employee(1,"Dariya",78900);
        Employee emp5 = new Employee(13,"Egor",92341);
        Employee emp6 = new Employee(54,"Loa",61247);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);


        Collections.sort(employees); // чтобы компилятор не ругался нужно в классе Employee имплементировать Comparable
        int index2 = Collections.binarySearch(employees,
                new Employee(90,"Alishev",5023));
        System.out.println(index2);


        // BINARY SEARCH FOR ARRAYS

        int[] array = {2, 5, -9, 4, 67, 0, 3, 1, -12, -1, -69};
        System.out.println(Arrays.toString(array)); // [2, 5, -9, 4, 67, 0, 3, 1, -12, -1, -69]
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [-69, -12, -9, -1, 0, 1, 2, 3, 4, 5, 67]
        int index3 = Arrays.binarySearch(array, -69);
        System.out.println(index3);


















    }
}
