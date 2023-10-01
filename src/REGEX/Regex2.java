package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {

//        String s1 = "ABCD ABCE  ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC"); ----- creating a pattern and passing a regular expression
//        Matcher matcher = pattern1.matcher(s1); ---- matching the string to the pattern

//        while(matcher.find()) { // true if "ABC" found
//            System.out.println(matcher.group());
//        }

          String str = "ABCD AB8 ABCI5";
//        Pattern pattern1 = Pattern.compile("[ABC]"); // or 'A' or 'B' or 'C'
//        Pattern pattern2 = Pattern.compile("ABC[I|5]"); // ABC and 'I' or '5'
//        Pattern pattern3 = Pattern.compile("AO[C-F]OP"); // AO[from C to F]OP    --- you can write a digit in the ranges
//        Pattern pattern4 = Pattern.compile("ABC."); // after 'ABC', anything can go
//        Pattern pattern5 = Pattern.compile("^ABC"); // is there a template expression in the line with the beginning
//        Pattern pattern6 = Pattern.compile("ABC$"); // finish

//        String str1 = "poka    abc    Qaisar doma";
//        Pattern pattern7 = Pattern.compile("\\w\\s+\\w"); // is there a template expression in the line with the beginning
//     result: a    a  \   c    Q \  r d

        String str1 = "abcd anc3 anc5 acnd1 abcg";
        Pattern pattern7 = Pattern.compile("\\D{2,6}"); // is there a template expression in the line with the beginning
//     result: abcd a \ nc \ anc \ acnd \ abcg








        Matcher matcher = pattern7.matcher(str1);


        while(matcher.find()) { // true if "ABC" found
            System.out.println("Position:" + matcher.start() + "  " + matcher.group());
        }


//        [^d-j] - must not contain letters in this range
//        [0-9] -  any symbol in the given range  \\d    ---- { \\D on the contrary }
//        [A-Za-z0-9_] or ("\\w")    ("\\w+") -- 1 and more symbol     |  ("\\w"{3}) - 3 symbol


    }
}