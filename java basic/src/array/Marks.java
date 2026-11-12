package array;

public class Marks {
    public static void main(String[] args) {

        int[] arr = {1, 23, 213, 1,213,1, 432, 52, 534, 1 , 345};
           int dup = arr[0];
        for (int i = 0; i < arr.length; i++) {
         if(dup == arr[i])
            System.out.print(i +" ");
        }
    }
}