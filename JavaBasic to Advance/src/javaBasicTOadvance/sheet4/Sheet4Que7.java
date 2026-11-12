package javaBasicTOadvance.sheet4;

public class Sheet4Que7 {
    public static void main(String[] args) {


                String str = "programming";

                int[] freq = new int[256];

                for (int i = 0; i < str.length(); i++) {

                    char ch = str.charAt(i);

                    freq[ch]++;
                }

                System.out.println("Duplicate characters:");

                for (int i = 0; i < str.length(); i++) {

                    char ch = str.charAt(i);

                    if (freq[ch] > 1) {

                        System.out.println(ch);

                        freq[ch] = 0;
                    }
                }
            }
        }
