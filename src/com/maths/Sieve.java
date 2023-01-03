package com.maths;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        // Initially, all elements of the boolean array are false
        sieve(n, primes);
    }
    
    // false in array means number is prime
    static void sieve(int n, boolean[] nums){
        for(int i = 2; i*i <=n; i++){
            if(!nums[i]){
                for(int j = i*2; j<=n; j+=i){
                    nums[j] = true;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(nums[i] == false){
                System.out.println(i);
            }
        }
    }
}
