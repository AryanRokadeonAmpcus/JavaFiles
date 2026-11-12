package javaBasicTOadvance.sheet2;

public class Sheet2Que15 {
    public static void main(String[] args) {
        int factorial = 1;
        int n = 5;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
