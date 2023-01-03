package com.maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors(36);
        System.out.println();
        factors2(36);
        System.out.println();
        factors3(36);
    }
    
    // Time Complexity -> O(N)
    public static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    // Time Complexity -> O(sqrt(N))
    public static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    System.out.print(n / i + " ");
                }
            }
        }
    }
    
    // Both time and space complexity -> O(sqrt(N))
    public static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
