package com.patterns;

import java.util.Arrays;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}