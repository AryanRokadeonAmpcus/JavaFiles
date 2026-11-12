package javaBasicTOadvance.sheet4;

public class Sheet4Que11 {
    public static void main(String[] args) {

                String str = "Java is very easy";

                String result = "";
                String word = "";

                for (int i = 0; i <= str.length(); i++) {

                    if (i < str.length() && str.charAt(i) != ' ') {

                        word = word + str.charAt(i);

                    } else {

                        for (int j = word.length() - 1; j >= 0; j--) {

                            result = result + word.charAt(j);
                        }

                        if (i < str.length()) {
                            result = result + " ";
                        }

                        word = "";
                    }
                }

                System.out.println("Original String: " + str);
                System.out.println("Reversed Words: " + result);
            }
        }
