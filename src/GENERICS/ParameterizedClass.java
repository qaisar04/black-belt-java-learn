package GENERICS;


public class ParameterizedClass {
    public static void main(String[] args) {
        /**     Subtyping   **/
//        Info<String> info1 = new Info<>("Hello!");
//        System.out.println(info1);

//        Info<Integer> info2 = new Info<>(213);
//        System.out.println(info2);

//        Info<Vehicle> info3 = new Info<>(new Vehicle());
//        System.out.println(info3);

//        Info<Double> info4 = new Info<>(34.234);
//        System.out.println(info4);


    }
}

class Info <T extends Number&I1&I2>{
    private T value;

    public Info(T value) {
      this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Vehicle {

}

interface I1 {}
interface I2 {}

