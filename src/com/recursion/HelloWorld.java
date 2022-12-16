package com.recursion;

public class HelloWorld {
    public static void main(String[] args) {
        printHelloWorld(5);
    }
    
    public static void printHelloWorld(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello World " + n);
        printHelloWorld(n - 1);
    }
}
