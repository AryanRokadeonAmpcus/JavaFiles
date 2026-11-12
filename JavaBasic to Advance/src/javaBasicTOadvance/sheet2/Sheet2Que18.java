package javaBasicTOadvance.sheet2;

public class Sheet2Que18 {
    public static void main(String[] args) {

        int num = 12345;
        int rev = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        System.out.println( rev);
            }
        }
