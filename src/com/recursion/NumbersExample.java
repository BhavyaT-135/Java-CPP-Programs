package com.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print1(1);
    }
    
    static void print1(int n) {
        System.out.println(n);
        n = n + 1;
        print2(n);
    }

    static void print2(int n) {
        System.out.println(n);
        n = n + 1;
        print3(n);
    }

    static void print3(int n) {
        System.out.println(n);
        n = n + 1;
        print4(n);
    }

    static void print4(int n) {
        System.out.println(n);
        n = n + 1;
        print5(n);
    }

    static void print5(int n) {
        System.out.println(n);
    }
}
