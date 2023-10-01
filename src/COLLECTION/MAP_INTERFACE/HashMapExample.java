package COLLECTION.MAP_INTERFACE;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // элементами HashMap являются пары ключ/значение. HashMap не запоминает порядок добавления
        // элементов. Его методы работают очень быстро.

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101200, "Qaisar");
        map1.put(1234234, "Sun");
        map1.put(34656, "Apple");
        map1.put(70987, "Cloud");
        map1.put(45612, "Hi");
        map1.put(679, "Good");
        map1.putIfAbsent(1234234, "Moon");


        System.out.println(map1); // ключи элементов должны быть уникальными, они могут быть null

        System.out.println(map1.get(101200)); // Qaisar


        System.out.println(map1.containsValue("Moon")); // false

        System.out.println(map1.keySet()); // [34656, 101200, 679, 1234234, 70987, 45612]

        System.out.println(map1.values()); // [Apple, Qaisar, Good, Sun, Cloud, Hi]


        /** Методы с HashMap:
         *
         *  put - добавить элемент
         *  putIfAbsent - добавь если такого элемента нет
         *  get - получить элемент, в параметрах принимает ключ
         *  remove - удалить элемент, в параметрах принимает ключ
         *  containsValue - возвращает true/false если такой элемент будет, в параметрах принимает значения
         *  containsKey - возвращает true/false если такой элемент будет, в параметрах принимает ключ
         *  keySet - получаем множество всех ключей
         *  values - получаем множество всех значений
         *
         */


    }
}
