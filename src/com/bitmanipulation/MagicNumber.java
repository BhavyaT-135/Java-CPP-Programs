package com.bitmanipulation;

public class MagicNumber {

    // A magic number is defined as a number which can be expressed as a power of 5
    // or sum of unique powers of 5.
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Magic number for " + n + " is: " + findMagicNumber(n));
    }
    
    public static int findMagicNumber(int n) {
        if(n == 0) return 0;
        
        int result = 0;
        int count = 1;
        while (n > 0) {
            result += Math.pow(5, count) * (n & 1);
            n = n >> 1;
            count++;
        }
        return result;
    }
}
