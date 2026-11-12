package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class cll1arr {
    public static void main(String[] args) {
//        ArrayList<Integer>marks = new ArrayList<>();
//        marks.add(50);
//        marks.add(56);
//        marks.add(54);
//        marks.add(48);
//        marks.add(50);
//        marks.add(56);
//        marks.add(54);
//        marks.add(48);
//        marks.add(50);
//        marks.add(56);
//        marks.add(54);
//        marks.add(48);
////        Collections.sort(marks,Collections.reverseOrder());
//       // marks.clear(); //clear all elements from array
//        int total =0;
//        for(int i = 0; i < marks.size(); i++) {
//            total = total + marks.get(i);
//        }
//
//        System.out.println(marks+ " The total : "+total);

        List<Integer> markuu = Arrays.asList(1,31,432,321,22);

        markuu.stream()
//                .filter()
                .sorted()
//                .map()
                .forEach(n -> System.out.println(n));
    }
}
