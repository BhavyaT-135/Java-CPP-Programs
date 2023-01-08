package com.recursionPatterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n, 0);
        pattern2(n, 0);
    }
    
    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            pattern(row, ++col);
        } else {
            System.out.println();
            pattern(--row, 0);
        }
    }

    static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            pattern2(row, ++col);
            System.out.print("* ");
        }
        else {
            pattern2(--row, 0);
            System.out.println();
        }
    }
}
