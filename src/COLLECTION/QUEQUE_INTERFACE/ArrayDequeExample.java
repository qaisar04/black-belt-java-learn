package COLLECTION.QUEQUE_INTERFACE;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Deque - double ended queue (двунаправленная очередь). В такой очереди элементы
        // могут использоваться с обоих концов. Здесь работают оба правила - FIFO и LIFO.

        // Интерфейс Deque реализуется классами LinkedList и ArrayDeque

        /**
         *  методы:
         *  addFirst/addLast - добавление
         *  offerFirst/offerLast - более безопасное добавление
         *
         *  removeFirst/removeLast - удаление
         *  pollFirst/pollLast - более безопасное удаление
         *
         *  getFirst/getLast - получение элемента
         *  peekFirst/peekLast - более безопасное получение элемента
         **/

        arrayDeque.addFirst(5);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(9);
        arrayDeque.offerFirst(1);
        arrayDeque.offerFirst(2);
        arrayDeque.offerLast(10);

        System.out.println(arrayDeque); // [2, 1, 3, 5, 9, 10]

        arrayDeque.removeFirst();
        arrayDeque.pollLast();

        System.out.println(arrayDeque); // [1, 3, 5, 9]
    }
}
