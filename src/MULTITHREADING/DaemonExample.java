package MULTITHREADING;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("main thread starts!");
       UserThread userThread = new UserThread();
       userThread.setName("user_thread");

       DaemonThread daemonThread = new DaemonThread();
       daemonThread.setName("daemon_thread");
       daemonThread.setDaemon(true);

       userThread.start();
       daemonThread.start();

        System.out.println("main thread ends!");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon: " + isDaemon());

        for(char i = 'A'; i <= 'J'; i++) {
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

     /** После того как поток userThread закончит свою программу, daemonThread автоматически закончит свою работу
     *  так как, daemon потоки используются для фоновых программмных вычислений.
     */


class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon: " + isDaemon());
        for(int i = 1; i <= 1000; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

