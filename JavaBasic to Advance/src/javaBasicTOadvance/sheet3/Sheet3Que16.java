package javaBasicTOadvance.sheet3;

public class Sheet3Que16 {
    public static void main(String[] args) {

        int n = 1223452;
        int[] freq = new int[10];

        for (int i = n; i > 0; i = i / 10) {

            int digit = i % 10;

            freq[digit]++;
        }

        System.out.println("Duplicate digits:");

        for (int i = 0; i <= 9; i++) {

            if (freq[i] > 1) {
                System.out.println(i);
            }
        }
    }
}