package javaBasicTOadvance.sheet4;

public class Sheet4Que8 {
    public static void main(String[] args) {
                String str = "programming";

                for (int i = 0; i < str.length(); i++) {

                    int count = 0;

                    for (int j = 0; j < str.length(); j++) {

                        if (str.charAt(i) == str.charAt(j)) {
                            count++;
                        }
                    }

                    if (count == 1) {

                        System.out.println("First non-repeated character: "
                                + str.charAt(i));

                        break;
                    }
                }
            }
        }
