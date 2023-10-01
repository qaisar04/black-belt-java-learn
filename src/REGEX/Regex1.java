package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: ivanov@mail.ru , Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru , Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com , Postcode: USA23, Phone Number: +136478952.";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); // чисто одиночные двухзначные цифры
//        Pattern pattern = Pattern.compile("\\+\\d{9}\\b"); // номера телефонов
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+"); // email
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)"); // email (ru or com)
          Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+"); // email



        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
