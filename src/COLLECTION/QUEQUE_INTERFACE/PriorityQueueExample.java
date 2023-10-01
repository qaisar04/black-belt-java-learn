package COLLECTION.QUEQUE_INTERFACE;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // PriorityQueue - это специальный вид очереди, в котором используется натуральная сортировка
        // или та, которую мы описываем с помощью Comparable или Comparator. Таким образов
        // используется тот элемент из очереди, приоритет которого выше.

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(4);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(10);
        priorityQueue.offer(8);

        System.out.println(priorityQueue); // [1, 4, 7, 10, 8] - натуральная сортировка


        Student st1 = new Student("Kate",2);
        Student st2 = new Student("Loka",3);
        Student st3 = new Student("Bob",5);
        Student st4 = new Student("Ryan",4);
        Student st5 = new Student("Lu",1);

        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();
        studentPriorityQueue.offer(st1);
        studentPriorityQueue.offer(st2);
        studentPriorityQueue.offer(st3);
        studentPriorityQueue.offer(st4);
        studentPriorityQueue.offer(st5);

        System.out.println(studentPriorityQueue);

        // удаление происходит по приоритету от выше к нижним
        System.out.println(studentPriorityQueue.poll());
        System.out.println(studentPriorityQueue.poll());
        System.out.println(studentPriorityQueue.poll());
        System.out.println(studentPriorityQueue.poll());
        System.out.println(studentPriorityQueue.poll());

    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course - otherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}

