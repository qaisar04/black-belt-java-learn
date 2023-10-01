package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String inputString = "12412412412412412412433;" +  // 24/12 1241 2412 4124 1241 (433)
                   "09412416412312412415623;" +
                   "89712456413332412409910;";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(inputString);

        String newString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(newString); // 24/12 1241 2412 4124 1241 (433);24/15 0941 2416 4123 1241 (623);24/09 8971 2456 4133 3241 (910);


//        while(matcher.find()) {
//            System.out.println(matcher.group(7)); // group 7 output
//        }

    }
}
