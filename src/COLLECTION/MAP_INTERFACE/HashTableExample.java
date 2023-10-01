package COLLECTION.MAP_INTERFACE;

import COLLECTION.MAP_INTERFACE.Student;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();

        Student st1 = new Student("Qaisar", "Losa", 2);
        Student st2 = new Student("Dariya", "Iopp", 1);
        Student st3 = new Student("Zyan", "Buao", 4);
        Student st4 = new Student("Loak", "Iolll", 2);

        hashtable.put(5.5, st1);
        hashtable.put(6.7, st2);
        hashtable.put(9.0, st3);
        hashtable.put(8.4, st4);

        // в Hashtable ни ключ ни значение не могут быть null
        // Hashtable является устаревшим классом, который работает по тем же принципам, что и HashMap

//        hashtable.put(null, st4); - NullPointerException

        // в отличие от Hashtable является synchronized. По этой причине его методы далеко не такие быстрые


        // даже если нужна поддержка многопоточности hashtable лучше не использовать, следует использовать ConcurrentHashMap
    }

}
