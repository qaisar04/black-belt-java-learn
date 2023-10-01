package MULTITHREADING;

public class MethodsNamePriority {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        myThread3.setName("my_thread");
        myThread3.setPriority(Thread.MIN_PRIORITY);
        myThread3.setPriority(9);
        myThread3.setPriority(Thread.MAX_PRIORITY);
        myThread3.setPriority(Thread.NORM_PRIORITY);



        System.out.println("Name of myThread3: " + myThread3.getName() +
                "\nPriority of myThread3: " + myThread3.getPriority());

    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Hi!");
    }
}
