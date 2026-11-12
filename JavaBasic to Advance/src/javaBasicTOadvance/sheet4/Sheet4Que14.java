package javaBasicTOadvance.sheet4;

public class Sheet4Que14 {
    public static void main(String[] args) {

                String str = "programming";

                int[] freq = new int[256];

                for (int i = 0; i < str.length(); i++) {

                    char ch = str.charAt(i);

                    freq[ch]++;
                }

                System.out.println("Character Frequency:");

                for (int i = 0; i < str.length(); i++) {

                    char ch = str.charAt(i);

                    if (freq[ch] > 0) {

                        System.out.println(ch + " = " + freq[ch]);

                        freq[ch] = 0;
                    }
                }
            }
        }
