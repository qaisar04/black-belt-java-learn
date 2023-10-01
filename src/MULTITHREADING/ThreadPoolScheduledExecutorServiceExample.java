package MULTITHREADING;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }

//        scheduledExecutorService.schedule(new RunnableImpl200(),
//                3, TimeUnit.SECONDS);
//         выполнить task: new RunnableImpl200(), через 3 секунды
//


//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(),
//                3,1,TimeUnit.SECONDS);
//         выполнить task: new RunnableImpl200() через 3 секунду с периодам в 1 секунду


        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(),
                3,1,TimeUnit.SECONDS);
//         выполнить task: new RunnableImpl200() через 3 секунду с периодам в 1 секунду

        // главное отличие scheduleWithFixedDelay, он завершит сначала работу первого task-а только потом
        // через секунду начнеться работа второго task-а



        Thread.sleep(20000);
        scheduledExecutorService.shutdown(); // выключение

    }
}


class RunnableImpl200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " ends work!");


    }
}