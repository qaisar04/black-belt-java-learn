package COLLECTION.LIST_INTERFACE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(); // capacity = 10

        arrayList1.add("Qaisar");
        arrayList1.add("Dariya");
        arrayList1.add("Eskendir");
        arrayList1.add("Ryan");
        arrayList1.add(3,"Inkar");

        arrayList1.remove(3);

        arrayList1.set(0,"Dariya");
        arrayList1.set(1,"Qaisar");

//        for(String s : arrayList1) {
//            System.out.print(s + " ");
//        }

        int i = arrayList1.indexOf("Ryan");
//        System.out.println(i); // 3


        arrayList1.contains("Qaisar"); /** возвращает true/false в зависимости от того найден ли такой элемент в массиве */


        /** методы:
         * addAll - принимает в параметр другой arrayList для добавление его в текущий arrayList
         * clear - удаляет все элементы arrayList-а
         * indexOf - ищет в arrayList-е обьект который дан в параметрах и возвращает его индекс, если элемент не найден возвращает -1
         * lastIndexOf - поиск идет с обратной стороны
         * size - размер массива
         * isEmpty - возвращает true если пуст, false если содержит в себе обьекты
         * contains - возвращает boolean в зависимости от того есть ли там такой обьект
         *
        */

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array); // с помощью массива получаем лист
        System.out.println(list); // [A, B, C, D]

        array[0].append("!@#");
        System.out.println(list); // [A!@#, B, C, D]

        array[0] = new StringBuilder("L");
        System.out.println(list); // [L, B, C, D]


















    }
}
