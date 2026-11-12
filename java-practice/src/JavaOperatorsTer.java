import java.util.Arrays;

public class JavaOperatorsTer {


    public static void HulkEkka() {
        int[] arry = {10, 20, 30, 40};
        System.out.print("{");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
            if (i != arry.length - 1) {
                System.out.print(",");

            }
        }
        System.out.print("}");
        for (int i = 3; i < arry.length; i++) {
            System.out.println("");
            System.out.println(Arrays.stream(arry).sum());
        }

    }


    public void main(String[] arg) {
//      for (int i = 0; i < 9; i++)

        JavaOperatorsTer.HulkEkka();

    }
}


//{10,20,30,40}