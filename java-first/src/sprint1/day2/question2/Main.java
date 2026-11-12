package sprint1.day2.question2;

public class Main {

    public static void sumOfNaturalNumbers(int n){
        int sum = 0;

//        for(int i=1;i<=n;i++){
//            sum = sum + i;
//        }

        int i = 1;

        while(i <= n){
            sum = sum + i;
            System.out.println("looping continue ........ ");
        }
//6
        System.out.println("Sum of first " + n + " natural numbers is "+sum);
    }

    public static void main(String[] args) {

        sumOfNaturalNumbers(3);

    }
}
