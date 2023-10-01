package COLLECTION.LIST_INTERFACE;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        String s = "nan";
//      String s = String.valueOf(число);

        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()) {
            list.add(ch);
        }

        // каждый char из массива добавляем в лист | result list: [n, a, n]

        ListIterator<Character> iterator = list.listIterator(); // default: 0

        // в параметрах указываем с какой позиции нужно начинать итерацию
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrom = true;

        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if(iterator.next() != reverseIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }

        if(isPalindrom) {
            System.out.println("Palindrom!");
        } else {
            System.out.println("Not palindrom!");
        }

    }
}
