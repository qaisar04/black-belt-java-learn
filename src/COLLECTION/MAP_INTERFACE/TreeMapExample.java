package COLLECTION.MAP_INTERFACE;

import COLLECTION.MAP_INTERFACE.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // В основе TreeMap лежит красно-черное дерево

        // в TreeMap элементы хранятся в отсортированном по возврастанию порядке (по ключу)
        // методы работают быстро, но не быстрее чем методы HashMap

        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Qaisar", "Losa", 2);
        Student st2 = new Student("Dariya", "Iopp", 1);
        Student st3 = new Student("Zyan", "Buao", 4);
        Student st4 = new Student("Loak", "Iolll", 2);
        Student st5 = new Student("Polo", "Up", 2);
        Student st6 = new Student("Diao", "Las", 1);
        Student st7 = new Student("Kosa", "Yoi", 4);
        Student st8 = new Student("Qwer", "Aso", 2);

        treeMap.put(6.4, st1); // добавляем элемент
        treeMap.put(5.8, st2);
        treeMap.put(6.9, st3);
        treeMap.put(9.4, st4);
        treeMap.put(7.3, st5);
        treeMap.put(4.1, st6);
        treeMap.put(9.0, st7);
        treeMap.put(4.4, st8);

        System.out.println(treeMap); // вывод TreeMap

        System.out.println("---------------------------------------------------------------------------");

        treeMap.get(6.4); // вывод по ключу
        treeMap.remove(4.1); // удаление по ключу

        System.out.println(treeMap.descendingMap()); // вывод TreeMap по убыванию

        System.out.println("---------------------------------------------------------------------------");


        System.out.println(treeMap.tailMap(7.3)); // вывод у кого ключ больше чем 7.3 (включительно)

        System.out.println("---------------------------------------------------------------------------");

        System.out.println(treeMap.headMap(7.3)); // вывод у кого ключ ниже чем 7.3

        System.out.println("---------------------------------------------------------------------------");

        System.out.println(treeMap.lastEntry()); // вывод максимального ключа
        System.out.println(treeMap.firstEntry()); // вывод минимального ключа

        System.out.println("---------------------------------------------------------------------------");

        // для того чтобы в ключе TreeMap принимал обьект то нужно имплементировать интерфейс Comparable
        // и реализовать метод compareTo

        // второй способ
        TreeMap<Student, Double> treeMap1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        treeMap1.put(st1, 4.2);
        treeMap1.put(st2, 9.5);
        treeMap1.put(st3, 8.3);
        treeMap1.put(st4, 6.0);

        System.out.println(treeMap1); // в алфавитном порядке

        System.out.println("---------------------------------------------------------------------------");







    }
}
