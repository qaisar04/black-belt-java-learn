package COLLECTION.QUEQUE_INTERFACE;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Queue - эта коллекция, хранящая последовательность элементов. Добавляется элемент в конец очереди,
        // а используется из начала очереди (правило FIFO)

        // класс LinkedList имплементирует не только интерфейс

        // добавлять элементы можно как с методом add так и offer. Но лучше использовать offer
        // также и с remove, лучше использовать poll

        queue.offer("Qaisar");
        queue.offer("Ryan");
        queue.offer("Bob");
        queue.offer("Kate");
        queue.offer("Liza");
        queue.offer("Igor");

        queue.poll(); // удаление элемента происходит тот кто первым стоит в очереди

        System.out.println(queue.element()); // узнать кто стоит на первом в очереди

        System.out.println(queue.peek()); // в случае если элемента нет вернет null, а метод element() выкинет ошибку


        System.out.println(queue);


    }
}
