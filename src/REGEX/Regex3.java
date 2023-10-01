package REGEX;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        // method matches and split
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: ivanov@mail.ru , Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru , Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com , Postcode: USA23, Phone Number: +136478952.";

        String s2 = "chuck@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.\\w+");
        System.out.println(result); // true


        String[] array = s.split(" "); // we separate the words with a space and add them to array
        String[] array2 = s.split("[,+:]"); // we add inside the square brackets any characters by which you want to divide the string.
        System.out.println(Arrays.toString(array));


    }
}
