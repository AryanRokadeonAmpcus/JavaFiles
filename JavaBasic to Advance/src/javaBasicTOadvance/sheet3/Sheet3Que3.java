package javaBasicTOadvance.sheet3;

import java.util.Scanner;

public class Sheet3Que3 {

        public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();

                    int primeCount = 0;

                    for (int num = 2; ; num++) {
                        int factorCount = 0;

                        for (int i = 1; i <= num; i++) {
                            if (num % i == 0) {
                                factorCount++;
                            }
                        }

                        if (factorCount == 2) { // prime
                            primeCount = primeCount + 1;

                            if (primeCount == n) {
                                System.out.println(num);
                                break;
                            }
                        }
                    }
                }
            }