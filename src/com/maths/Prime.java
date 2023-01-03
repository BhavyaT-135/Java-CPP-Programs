package com.maths;

public class Prime {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("Is n a prime number? " + isPrime(n));
    }
    
    public static boolean isPrime(int n) {
        if(n<=1){
            return true;
        }
        boolean ans = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = false;
            }
        }
        return ans;
    }
}
