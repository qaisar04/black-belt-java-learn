package COLLECTION.THREAD_SAFE;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue =
                new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(() -> {
            int i = 0;
            while(true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer добавил число: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while(true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer забрал число: " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();




    }
}
