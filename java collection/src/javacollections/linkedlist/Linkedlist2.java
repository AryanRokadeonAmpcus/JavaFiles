package javacollections.linkedlist;

import java.util.LinkedList;

public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Sumit");
        names.add("Dikshit");
        names.add("Vinit");
        names.add("Shailesh");
        names.add(0,"Aryan");
        names.addFirst("Parth");
        names.addLast("Zimba");



        System.out.println();
        System.out.println(names.getFirst());
        System.out.println(names.get(3));
        System.out.println(names.getLast());
        System.out.println(names.clone());


    }
}
