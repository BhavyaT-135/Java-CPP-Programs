package com.maths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(9,18));
    }
    
    public static int euclideanGCD(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return euclideanGCD(b % a, a);
        }
    }

    public static int lcm(int a, int b){
        return a * b / euclideanGCD(a, b);
    }
}
