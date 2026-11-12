package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class cll1arr2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aryan");
        names.add("Rahul");
        names.add("Virat");
        names.add("Rohit");
        names.add("Dhoni");
        ArrayList<String> name = new ArrayList<>(
                Arrays.asList("Aryan", "Ramesh", "Rutvik", "Tejraj")
        );




        for (String Aryy: name)
            System.out.print(Aryy+" ");
    }
}
