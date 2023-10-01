package REGEX;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Hello,    my  little friend!";
        System.out.println(s1);
//        s1 = s1.replace("little","big"); // Hello,    my  big friend!
//        s1 = s1.replaceAll(" {2,}"," "); // Hello, my little friend!
//        s1 = s1.replaceAll("\\bm\\w+", "your"); // Hello,    your  little friend!
        s1 = s1.replaceFirst("\\bm\\w+", "your"); // the first word will change where it fits this template

        System.out.println(s1);


    }
}
