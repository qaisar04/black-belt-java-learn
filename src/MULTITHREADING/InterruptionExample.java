package MULTITHREADING;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts!");
        InterrupdetThread thread = new InterrupdetThread();
        thread.start();
        Thread.sleep(20);
        thread.interrupt();

        thread.join();
        System.out.println("main ends!");
    }
}

class InterrupdetThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 10000000; i++) {
            if(isInterrupted()) {
                System.out.println("Поток хотят прервать!");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
