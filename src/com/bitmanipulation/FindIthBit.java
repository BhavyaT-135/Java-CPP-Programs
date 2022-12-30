package com.bitmanipulation;

public class FindIthBit {
    public static void main(String[] args) {
        int num = 53;
        int i = 3;
        System.out.println("Is " + i + "th bit of " + num + " 1? " + findIthBit(num, i));
    }
    
    public static boolean findIthBit(int n, int i) {
        return (n & (1 << i-1)) != 0;
    }
}
