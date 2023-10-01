package GENERICS;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list1 = new ArrayList<>();
//        List<X> list1 = new ArrayListEx1<Y>(); - фатальная ошибка


    }

}

class X  {

}

class Y extends X {

}
