package GENERICS;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {

//        List<? extends Number> listI = new ArrayListEx1<>(Integer);
//        List<? super Number> listI = new ArrayListEx1<>(Object);

//        <?> означает любой класс


        List<?> list = new ArrayList<Integer>();
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(234.0);
        list1.add(3.15);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("Good");
        list2.add("Bye");
        showListInfo(list2);

        ArrayList<Double> arrayList1 = new ArrayList<>();
        arrayList1.add(3.14);
        arrayList1.add(234.0);
        arrayList1.add(3.15);
        System.out.println(sum(arrayList1));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(1212);
        arrayList2.add(12324);
        System.out.println(sum(arrayList2));



    }

    static void showListInfo(List<?> list) {
        System.out.println("Show list:" + list);
    }

    static public double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;

        for(Number n : arrayList) {
            sum+=n.doubleValue();
        }
        return sum;
    }
}
