package javacollections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cll1arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.println(":Enter list count");
        int t = sc.nextInt();
//        for (String name : names) {
//            System.out.println(name);

//        }

        for (int i = -1; i < t; i++) {

            System.out.print("Username is :");

            String a = sc.nextLine();
            names.add(a);

        }
//        for (String name : names){
//            System.out.println(name);
        }
    }

