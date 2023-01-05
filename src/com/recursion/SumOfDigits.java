package com.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
    
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigits((int) (n / 10));
    }
}
