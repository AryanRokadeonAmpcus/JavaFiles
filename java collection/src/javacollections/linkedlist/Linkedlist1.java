package javacollections.linkedlist;

import java.util.LinkedList;

public class Linkedlist1 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();

        names.add("Sarthak");
        names.add("Pradyumna");
        names.add("Shailesh");

        names.addFirst("Ashu");

        names.removeLast();
        System.out.println(names);

        names.getFirst();

    }
}
