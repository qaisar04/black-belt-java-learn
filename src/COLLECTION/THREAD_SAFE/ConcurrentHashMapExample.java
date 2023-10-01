package COLLECTION.THREAD_SAFE;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        /**
         * ConcurrentHashMap имплементирует интерфейс ConcurrentMap,
         * который в свою очередь происходит от интерфейса Map.
         */

        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1,"Bob");
        hashMap.put(2,"Kate");
        hashMap.put(3,"Patrick");
        hashMap.put(4,"Zaur");
        hashMap.put(5,"Kollas");

        System.out.println(hashMap);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while(iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Integer i = iterator.next();
                System.out.println("key: " + i + "  value: " + hashMap.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            hashMap.put(6,"Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(hashMap);


    }
}
