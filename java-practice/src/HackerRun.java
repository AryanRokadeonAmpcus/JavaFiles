import java.lang.invoke.StringConcatFactory;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HackerRun {
    public static void main(String[] args) {
//        int n = 18;
//        if (n%2 == 1) {
//            System.out.println("weird");
//        //}else if (n%2 == 0){
//          //  System.out.println("not weird");
//        }
//         else if(n<=2 || n<=5){
//                System.out.println("not werid");
//            } else if (n<=6 || n<=20){
//            System.out.println("weird");
//        } else
//            System.out.println("not werid");
//
//     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
      Scanner input  = new Scanner(System.in);
      String a = input.nextLine();
      for(int i=0; i < a.length(); i++)
        System.out.print(a.charAt(i)+ ",");


        }

    }