package javaBasicTOadvance.sheet2;

import java.util.Scanner;

public class Sheet2Que3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int num2 = sc.nextInt();



        int sum = num + num2;
        int sub = num - num2 ;
        int div = num / num2;
        int mul = num * num2;


        String expression = sc.next();

        switch (expression){
            case "+":
                System.out.println(sum);
                break;
            case "-":
                System.out.println(sub);
                break;
            case "/":
                System.out.println(div);
                break;
            case "*":
                System.out.println(mul);
                break;
        }
    }
}