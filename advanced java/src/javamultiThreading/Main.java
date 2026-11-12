package javamultiThreading;
class MyThread1 extends Thread {

    Object lock1;
    Object lock2;

    MyThread1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {

        synchronized (lock1) {

                System.out.println("Thread-1 acquired Lock1");

            synchronized (lock2) {
                System.out.println("Thread-1 acquired Lock2");
                System.out.println("Thread-1 completed work");
            }
        }
    }
}

class MyThread2 extends Thread {

    Object lock1;
    Object lock2;

    MyThread2(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {

        synchronized (lock1) {   // Same order
            System.out.println("Thread-2 acquired Lock1");

            synchronized (lock2) {
                System.out.println("Thread-2 acquired Lock2");
                System.out.println("Thread-2 completed work");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();

        MyThread1 t1 = new MyThread1(lock1, lock2);
        MyThread2 t2 = new MyThread2(lock1, lock2);

        t1.start();
        t2.start();
    }
}
