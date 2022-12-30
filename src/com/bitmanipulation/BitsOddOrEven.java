package com.bitmanipulation;

public class BitsOddOrEven {
    public static void main(String[] args) {
        int num = 53;
        System.out.println("Is " + num + " odd? " + isOdd(num));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
