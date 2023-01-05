package com.recursion;

public class PrintNos {
    public static void main(String[] args) {
        int num = 5;
        printNos(num);
    }
    
    static void printNos(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n); // Prints 5 4 3 2 1 when stack is filling up
        printNos(n - 1);
        System.out.println(n); // Prints 1 2 3 4 5 when stack is emptying down
    }
}
