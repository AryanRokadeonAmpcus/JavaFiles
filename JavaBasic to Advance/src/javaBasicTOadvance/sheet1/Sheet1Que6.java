package javaBasicTOadvance.sheet1;

public class Sheet1Que6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 43;
        System.out.println("before swapp : "+a +":"+b);

        a = a + b - (b = a);


        System.out.println("After swapp: "+a+":"+b);
    }
}
