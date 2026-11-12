package javacollections.arraylist;
import java.util.ArrayList;

class Cll1arr1 {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<>();
       Students.add("Samarth");
       Students.add("Shailesh");
       Students.add("Parth");
       Students.add("Shrivastav");
       Students.add("Rameshwar");

          Students.remove(0);
          Students.set(1,"loine");
        System.out.println(Students.clone());
        System.out.println(Students);
        System.out.println(Students);
        System.out.println(Students.get(1));
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print( " 123456789  " + ch);

        }
    }
}