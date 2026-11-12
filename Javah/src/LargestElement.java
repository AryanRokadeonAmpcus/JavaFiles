public class LargestElement{
    public static void main(String[] args) {

        int a = 238454;

     int rev = 0;


     for (; a > 0; a = a /10){
         int nem  = a % 10;

         rev = rev * 10 + nem;
     }
        System.out.println(rev);
    }
}
