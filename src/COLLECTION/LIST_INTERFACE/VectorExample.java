package COLLECTION.LIST_INTERFACE;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("Hi");
        vector.add("Bye");
        vector.add("Sun");

        System.out.println(vector); // [Hello, Hi, Bye, Sun]

        System.out.println(vector.firstElement()); // Hello

        System.out.println(vector.lastElement()); // Sun

        vector.remove(2);
        System.out.println(vector); // [Hello, Hi, Sun]

        // Vector - устаревший synchronized класс. В своей основе содержит массив элементов Object
        // Не рекомендован для использование











    }
}
