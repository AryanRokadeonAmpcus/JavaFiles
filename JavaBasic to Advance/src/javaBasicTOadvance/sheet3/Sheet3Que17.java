package javaBasicTOadvance.sheet3;

public class Sheet3Que17 {
    public static void main(String[] args) {
                int n = 1223452;
                int[] freq = new int[10];

                for (int i = n; i > 0; i = i / 10) {

                    int digit = i % 10;

                    freq[digit]++;
                }

                for (int i = 0; i <= 9; i++) {

                    if (freq[i] > 0) {
                        System.out.println(
                                i + " = " + freq[i] + " times"
                        );
                    }
                }
            }
        }