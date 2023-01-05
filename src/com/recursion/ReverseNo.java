package com.recursion;

public class ReverseNo {
    public static void main(String[] args) {
        System.out.println(reverse(1824));
    }
    
    static int reverse(int n){
        if (n / 10 == 0) {
            return n;
        }
        int power = (int)(Math.log10(n));
        return (n % 10) * (int) Math.pow(10, power) + reverse(n / 10);
    }
}
