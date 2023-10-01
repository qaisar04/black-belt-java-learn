package MULTITHREADING;

public class VolatileMethods extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long count = 0;
        while (b) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileMethods thread = new VolatileMethods();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 second it is time to wake up!");
        thread.b = false;

        thread.join();

        System.out.println("end of program!");


    }
}

