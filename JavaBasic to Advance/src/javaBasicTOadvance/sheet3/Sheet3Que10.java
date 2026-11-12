package javaBasicTOadvance.sheet3;

public class Sheet3Que10 {
    public static void main(String[] args) {

        int n = 145;
        int temp = n;
        int sum = 0;

        for (int i = n; i > 0; i = i / 10) {

            int digit = i % 10;
            int fact = 1;

            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }

            sum = sum + fact;
        }

        if (sum == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
