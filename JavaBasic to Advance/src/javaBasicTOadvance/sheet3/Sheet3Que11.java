package javaBasicTOadvance.sheet3;

public class Sheet3Que11 {
    public static void main(String[] args) {
        int n = 25;
        int square = n * n;
        int count = 0;
        int divisor = 1;

        for (int i = n; i > 0; i = i / 10) {
            count++;
        }

        for (int i = 1; i <= count; i++) {
            divisor = divisor * 10;
        }

        if (square % divisor == n) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
