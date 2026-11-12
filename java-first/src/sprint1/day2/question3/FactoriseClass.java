package sprint1.day2.question3;

public class FactoriseClass {

    public static void main(String[] args) {
       int num = 12;

       for (int i =1;i <= num; i++ ){
           if(num%i==0){
               System.out.println(i);
           }
       }
    }
}