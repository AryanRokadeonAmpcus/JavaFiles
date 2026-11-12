//import javax.swing.plaf.synth.SynthOptionPaneUI;
//
//public class JavaDecisionMaking {
//
//      public static int Koppo() {
//
//        int[] arr = {10, 20, 30, 40, 50};
//        int sum = 0;
//        int largest = arr[0];
//        int smallest = arr[0];
//        int sub = 0;
//        //int llo = 0;
//
//
//        System.out.print("{");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if (i != arr.length - 1)
//                System.out.print(",");
//
//            sum = sum + arr[i];
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//            {
//
//                sub = arr[arr.length - 1]; // start with 50
//                for (int i = arr.length - 2; i >= 0; i--) {
//                    sub = sub - arr[i];
//            }
//
//
//        }
//        System.out.print("}");
//        System.out.println("");
//        System.out.println("The sum is : " + sum);
//        System.out.println("Largest number = " + largest);
//        System.out.println("Smallest number = " + smallest);
//          System.out.println("Entire arr sub = " + sub);
//
//            return 0;
//     }
//        }
//
// public static void main() {
//     //JavaDecisionMaking obj = new JavaDecisionMaking();
//     for (int i = 1; i <= 2; i++) {
//         System.out.println("");
//         JavaDecisionMaking.Koppo();
//     }
// }
//}