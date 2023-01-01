package com.bitmanipulation;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(power(base, power));
    }
    
    public static int power(int a, int b) {
        int ans = 1;
        int base = a;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans *= base;
            }
            base *= base;
            b >>= 1;
        }
        return ans;
    }
}