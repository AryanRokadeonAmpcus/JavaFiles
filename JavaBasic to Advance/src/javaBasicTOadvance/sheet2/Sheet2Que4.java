package javaBasicTOadvance.sheet2;

public class Sheet2Que4 {
    public static void main(String[] args) {
        char ch = 'e';
//        if (ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' ||
//                ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U') {

        if ("AEIOUaeiou".contains(String.valueOf(ch))){
            System.out.println("Vowel");
        } else {
            System.out.println("Its not a vowel");
        }
    }
}
