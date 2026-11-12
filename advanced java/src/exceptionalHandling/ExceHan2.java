public class ExceHan2 {

    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        int k = 0;
        int [] nums = {1,2,4,45,4};
        try {
            k = i / j;
            System.out.println(nums[9]);
        }
        catch (ArithmeticException e){
            System.out.println("Dont divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("NO value in arr");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(k);
        System.out.println("Bye");
    }
}

