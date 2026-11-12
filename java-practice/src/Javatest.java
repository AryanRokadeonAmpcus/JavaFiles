
public class Javatest {

     static void primeNumbers(int a){

         System.out.println(checkPrimeOrNot(a) ? "This number is prime": "");

         if(a>=2 && a<=100){
             System.out.println(a);

             for(int i = 1; i <= a; i++){
                 if (a%i == 0){
                     System.out.println(i);
                 }

             }
         }else
             System.out.println("Its inavalid");

    }

    public static boolean checkPrimeOrNot(int num){

         int count = 0;

         for(int i=1;i<=num;i++){
             if(num%i == 0){
                 count ++;
             }
         }

         if(count == 2){
//             System.out.println("This number is prime");
             return true;
         }else{
//             System.out.println("This number is not a prime");
             return false;
         }

    }

    public static void main(String[] args) {
//     Javatest primenumbers = new Javatest();
        Javatest primenumbers = new Javatest();
        Javatest.primeNumbers(15);

    }
}
