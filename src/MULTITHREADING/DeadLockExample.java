package MULTITHREADING;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();

    }

}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: попытка захватить монитор обьекта lock1");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread10: монитор обьекта lock1 захвачен");
            System.out.println("Thread10: попытка захватить монитор обьекта lock2");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread10: мониторы обьектов lock1 и lock2 захвачены");
            }
        }
    }
}


class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: попытка захватить монитор обьекта lock2");
        synchronized (DeadLockExample.lock2) {
            System.out.println("Thread20: монитор обьекта lock2 захвачен");
            System.out.println("Thread20: попытка захватить монитор обьекта lock1");
            synchronized (DeadLockExample.lock1) {
                System.out.println("Thread20: мониторы обьектов lock2 и lock1 захвачены");
            }
        }
    }
}

// решение: сделать порядок synchronized мониторов одинаковыми в двух методах,
// то есть сначала synchronized (DeadLockExample.lock1) и внутри synchronized (DeadLockExample.lock2)