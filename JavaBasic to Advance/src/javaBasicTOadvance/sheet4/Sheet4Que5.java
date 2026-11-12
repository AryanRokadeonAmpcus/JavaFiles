package javaBasicTOadvance.sheet4;

public class Sheet4Que5 {
    public static void main(String[] args) {

                String str = "Java is easy to learn";

                int count = 0;

                for (int i = 0; i < str.length(); i++) {

                    if (str.charAt(i) != ' ' &&
                            (i == 0 || str.charAt(i - 1) == ' ')) {

                        count++;
                    }
                }

                System.out.println("Total words = " + count);
            }
        }
