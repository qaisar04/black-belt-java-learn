package GENERICS;

import java.util.ArrayList;

public class TYPEERASURE {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //  ArrayListEx1 arrayList = new ArrayListEx1(); - для JVM

        arrayList.add(777);
        arrayList.add(234234);
        arrayList.add(12312);
        arrayList.add(0123);
        arrayList.add(9202);

        int num = arrayList.get(0);
        //  int num = (Integer) arrayList.get(0); - для JVM, возвращается Object а потом ----> Integer

        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);



    }
    // два метода не совместимы так как для JVM они будут выглядить одинаково

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }

    // abc(Info info)

}

class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
}

class Child extends Parent {
    // переопределять метод тоже нельзя
//    public void abc(Info<Integer> info) {
//        Int i = info.getValue();
//    }
}





