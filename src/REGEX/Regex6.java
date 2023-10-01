package REGEX;

import java.util.regex.Pattern;

public class Regex6 {

    void checkIP(String IP) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
//        25[0-5]   |  2[0-4]\d     |   [01]?\d?\d)   3 раза и после каждого точка
//        250-255   |  200-249      |   0-199  1 раз без точки


        System.out.println(IP + " is OK? " + Pattern.matches(regex, IP));
    }


    public static void main(String[] args) {
        // Проверка IP |  0-255.0-255.0-255.0-255

        String ip1 = "255.38.192.99"; // true
        String ip2 = "263.38.32.99";  // false
        String ip3 = "196.155.23.44"; // true
        Regex6 r6 = new Regex6();

        r6.checkIP(ip1);
        r6.checkIP(ip2);
        r6.checkIP(ip3);

    }
}

