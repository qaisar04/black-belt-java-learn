package MULTITHREADING;

public class Example4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Example4 thread2 = new Example4();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Finish!");

    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
