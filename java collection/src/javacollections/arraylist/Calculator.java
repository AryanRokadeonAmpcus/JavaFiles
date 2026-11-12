package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Process :");

        String c = sc.nextLine();

        System.out.print("numbers : ");

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int sub = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++) {
            sub -= numbers.get(i);
        }
        int sum = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        int div = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++) {
            div /= numbers.get(i);
        }
        int mul = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++) {
            mul *= numbers.get(i);
        }
        switch (c) {
            case "sub" :
                System.out.println("Subtraction = " + sub);
                break;
            case "sum":
                System.out.println("addition = " + sum);
                break;
            case "mul":
                System.out.println("multiplication = "+mul);
                break;
            case "div":
                System.out.println("division = " + div);
                break;
}
    }
}