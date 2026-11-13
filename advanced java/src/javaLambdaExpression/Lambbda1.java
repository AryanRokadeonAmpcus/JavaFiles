package javaLambdaExpression;

public class Lambbda1 {
    public static void main(String[] args) {

        Runnable Runnable = () -> {
            System.out.println("Run The marathon");
        };
        Thread t1 = new Thread(Runnable);
        t1.start();
    }
}
