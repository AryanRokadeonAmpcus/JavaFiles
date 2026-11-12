package javaBasicTOadvance.sheet3;

public class Sheet3Que1 {
    public static void main(String[] args) {

        int num = 4;
                for (int i = num; i <= num; i++) {
                    int count = 0;


                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.print(i + " is a prime number ");
            }
                    else
                        System.out.println("Not a prime number");
        }
    }
}