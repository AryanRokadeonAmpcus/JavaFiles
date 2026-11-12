package javaBasicTOadvance.sheet3;

public class Sheet3Que12 {
    public static void main(String[] args) {
        int n = 18;
        int temp = n;
        int sum = 0;

        for (int i = n; i > 0; i = i / 10) {

            int digit = i % 10;
            sum = sum + digit;
        }

        if (n > 0 && n % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
