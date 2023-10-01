package MULTITHREADING;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Qaisar", callBox);
        new Person("Zaur", callBox);
        new Person("Kate", callBox);
        new Person("Bob", callBox);
        new Person("Patrick", callBox);



    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет..");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном..");
            sleep(2000);
            System.out.println(name + " завершил(а) звонок..");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }


}