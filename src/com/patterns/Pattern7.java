package com.patterns;

import java.util.Arrays;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int noOfCols = 2 * i - 1;
            int noOfSpaces = 2*(n - i);
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                int k = j > i ? j: 2 * i - j;
                System.out.print(k-i+1 + " ");
            }
            System.out.println();
        }
    }
}