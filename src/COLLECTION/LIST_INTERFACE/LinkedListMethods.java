package COLLECTION.LIST_INTERFACE;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        StudentLinkedListClass st1 = new StudentLinkedListClass("Qaisar",2);
        StudentLinkedListClass st2 = new StudentLinkedListClass("Merei",2);
        StudentLinkedListClass st3 = new StudentLinkedListClass("Alkuat",2);
        StudentLinkedListClass st4 = new StudentLinkedListClass("Zhansaya",2);
        StudentLinkedListClass st5 = new StudentLinkedListClass("Akzhol",1);

        LinkedList<StudentLinkedListClass> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(1, st5);

        System.out.println(studentLinkedList);

        // элементы LinkedList - это звенья одной цепочки. Эти элементы хранят
        // определенные данные, а также ссылки на предыдущий и следущий элементы.

        // LinkedList использовать тогда когда: мало операции в коде с получением кода и
        // большое количество кода связанная с добавлением/удалением



    }
}

class StudentLinkedListClass {
    String name;
    int course;

    public StudentLinkedListClass(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Strudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

