package javaBasicTOadvance.sheet3;

public class Sheet3Que7 {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {

            int temp = n;
            int count = 0;
            int sum = 0;

            for (int i = n; i > 0; i = i / 10) {
                count++;
            }

            for (int i = n; i > 0; i = i / 10) {

                int digit = i % 10;
                int power = 1;

                for (int j = 1; j <= count; j++) {
                    power = power * digit;
                }

                sum = sum + power;
            }

            if (sum == temp) {
                System.out.println(n);
            }
        }
    }
}
