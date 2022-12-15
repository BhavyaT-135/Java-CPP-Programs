package com.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2 + 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}