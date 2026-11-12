package javaBasicTOadvance.sheet3;

public class Sheet3Que5 {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int lcm = 1;

        for (int i = 1; i <= a * b; i++) {

            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM = " + lcm);
    }
}
