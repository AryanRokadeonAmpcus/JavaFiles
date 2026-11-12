package javamultiThreading;

class process1 implements Runnable {
    public void run() {
        int i;
        for (i = 0;i <= 10; i++ ) {
            System.out.println("process1:"+ i );
        }

    }
}
class  process2 implements Runnable {
    public void run() {
        for (; ;) {
            System.out.println("Procees2 :");
        }
    }
}

class MulThr {
    public static void main (String[] args) {
        process1 p1 = new process1();
        process2 p2 = new process2();

        Thread t1 = new  Thread(p1);
        Thread t2 = new  Thread(p2);

        t1.start();
        t2.start();

    }
}
