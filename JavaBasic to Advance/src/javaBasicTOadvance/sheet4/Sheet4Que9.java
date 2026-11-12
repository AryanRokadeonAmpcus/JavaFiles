package javaBasicTOadvance.sheet4;

public class Sheet4Que9 {
    public static void main(String[] args) {

                String str = "programming";

                boolean found = false;

                for (int i = 0; i < str.length(); i++) {

                    for (int j = i + 1; j < str.length(); j++) {

                        if (str.charAt(i) == str.charAt(j)) {

                            System.out.println(
                                    "First repeated character: " + str.charAt(i)
                            );

                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No repeated character");
                }
            }
        }