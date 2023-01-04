package com.maths;

public class EuclideanAlgorithmHCF {
    public static void main(String[] args) {
        System.out.println(euclideanGCD(224,105));
    }
    
    public static int euclideanGCD(int a, int b){
        if (a == 0) {
            return b;
        }
        else {
            return euclideanGCD(b % a, a);
        }
    }
}
