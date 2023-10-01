package COLLECTION.MAP_INTERFACE;

import COLLECTION.MAP_INTERFACE.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> linkedHashMap =
                                          new LinkedHashMap<>(16,0.75f, true);
        // если в accessOrder будет true тогда при выводе LinkedHashMap мы увидем то что
        // последним элементом выведется тот который был использован последним и тд


        Student st1 = new Student("Qaisar", "Losa", 2);
        Student st2 = new Student("Dariya", "Iopp", 1);
        Student st3 = new Student("Zyan", "Buao", 4);
        Student st4 = new Student("Loak", "Iolll", 2);

        linkedHashMap.put(6.4, st1); // добавляем элемент
        linkedHashMap.put(5.8, st2);
        linkedHashMap.put(6.9, st3);
        linkedHashMap.put(9.4, st4);

        System.out.println(linkedHashMap); // в каком порядке мы добавили студентов, в таком порядке они и будут выведены

        System.out.println("-----------------------------------------------------------------------------");

        // accessOrder: true
        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(6.4));

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println(linkedHashMap);
        // {6.9=Student{name='Zyan', surname='Buao', course=4}, 9.4=Student{name='Loak', surname='Iolll', course=2}, 5.8=Student{name='Dariya', surname='Iopp', course=1}, 6.4=Student{name='Qaisar', surname='Losa', course=2}}


        // LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавление элементов
        // или порядка их использования. Производительность методов немного ниже, чем у методов HashMap.


    }
}
