package COMPARATION;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//      Executors.newSingleThreadExecutor() - создать pool с одним потокам.

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100());
        }
        executorService.shutdown(); // программа завершается после всех выполненных задачах,
        // executorService понимает то что после метода shutdown() новых задач больше не будет.


        executorService.awaitTermination(4, TimeUnit.SECONDS);
        System.out.println("main ends!");
    }
}


class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work!");
    }
}