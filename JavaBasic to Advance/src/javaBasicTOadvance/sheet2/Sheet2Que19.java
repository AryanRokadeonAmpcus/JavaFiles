package javaBasicTOadvance.sheet2;

public class Sheet2Que19 {
    public static void main(String[] args) {

        int num = 43;
        int k = num;
        int rev = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;

        }
        if (rev == k){
            System.out.println("Its a palindrome number");
        }else
            System.out.println("Its not a palindrome number");

    }
}

