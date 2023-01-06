package com.recursion;

public class NumberOfZeroes {
    public static void main(String[] args) {
        System.out.println(zeroes(30204, 0));
    }
    
    static int zeroes(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return zeroes(n / 10, count);
    }
}
