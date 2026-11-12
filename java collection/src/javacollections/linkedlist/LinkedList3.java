package javacollections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(12);
        numbers.add(33);
        numbers.add(3423);
        numbers.add(87823);
        numbers.add(1238);
        numbers.add(12378);
        numbers.add(546123);
        numbers.add(3456);
        numbers.add(24653);
        numbers.add(23);
        numbers.add(53);

        int max = numbers.getFirst();
        for (Integer num : numbers) {
            if (num > max) {
                max = num;
//        Integer pratiksir =  Collections.max(numbers);
//        System.out.println(pratiksir);
            }


        }
        System.out.println(max);

    }
}