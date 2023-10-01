package GENERICS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("OK");
//        list.add(5);
//        list.add(new Car());

        for(Object s : list) {
            System.out.println(s + " - length: " + ((String) s).length());
        }

    }
}

class Car {

}
