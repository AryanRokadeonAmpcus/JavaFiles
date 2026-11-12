package exceptionalHandling;

//Basic try catch.

public class ExceHan {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        try {
            k = i / j;
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println(k);
        System.out.println("Bye");
    }
}

