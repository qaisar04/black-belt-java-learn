package GENERICS;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(777);
        arrayList.add(234234);
        arrayList.add(12312);
        arrayList.add(0123);
        arrayList.add(9202);

        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) { // return type - T
      return al.get(1);
    }
}
