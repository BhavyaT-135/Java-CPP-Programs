package com.bitmanipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int num = -5;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
    }
    
    public static int setBits(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n -= (n & -n);
        }

        return count;
    }
}
