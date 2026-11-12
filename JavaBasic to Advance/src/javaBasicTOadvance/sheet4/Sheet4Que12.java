package javaBasicTOadvance.sheet4;

public class Sheet4Que12 {
    public static void main(String[] args) {

                String str = "Java is very easy";

                String word = "";
                String result = "";

                for (int i = 0; i <= str.length(); i++) {

                    if (i < str.length() && str.charAt(i) != ' ') {

                        word = word + str.charAt(i);

                    } else {

                        if (result.equals("")) {
                            result = word;
                        } else {
                            result = word + " " + result;
                        }

                        word = "";
                    }
                }

                System.out.println("Original String: " + str);
                System.out.println("Reversed Word Order: " + result);
            }
        }
