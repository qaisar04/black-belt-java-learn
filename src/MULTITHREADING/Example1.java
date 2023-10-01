package MULTITHREADING;

public class Example1 {
    public static void main(String[] args) {

        // Многопоточность - это принцип построение программы, при котором несколько блоков кода
        // могут выполняться одновременно.

        // Основные цели: производительность и concurrency(параллелизм)

        // между потоками нет никакой синхронизации
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

