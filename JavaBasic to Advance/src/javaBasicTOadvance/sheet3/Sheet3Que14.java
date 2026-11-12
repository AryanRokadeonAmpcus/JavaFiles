package javaBasicTOadvance.sheet3;

public class Sheet3Que14 {
    public static void main(String[] args) {

        int n = 6;

        int a = 0;
        int b = 1;
        int c = 0;

        if (n == 0) {
            System.out.println(0);
        }
        else if (n == 1) {
            System.out.println(1);
        }
        else {

            for (int i = 2; i <= n; i++) {

                c = a + b;

                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci = " + c);
        }
    }
}
