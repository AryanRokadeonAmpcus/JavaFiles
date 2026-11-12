package javaBasicTOadvance.sheet4;

public class Sheet4Que13 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        int[] freq = new int[256];

        if (str1.length() != str2.length()) {

            System.out.println("Not Anagram");

        } else {

            for (int i = 0; i < str1.length(); i++) {

                char ch = str1.charAt(i);
                freq[ch]++;
            }

            for (int i = 0; i < str2.length(); i++) {

                char ch = str2.charAt(i);
                freq[ch]--;
            }

            boolean anagram = true;

            for (int i = 0; i < 256; i++) {

                if (freq[i] != 0) {
                    anagram = false;
                    break;
                }
            }

            if (anagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}