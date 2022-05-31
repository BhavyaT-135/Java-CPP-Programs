package com.bhavya;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(15, 26));
        System.out.println(Greet("Bhavya"));
    }

    static String sum(int num1, int num2) {
    // Scanner in = new Scanner(System.in);
    // int num1 = in.nextInt();
    // int num2 = in.nextInt();
    int sum = num1 + num2;
    return (String)("Sum of " + num1 + " and " + num2 + " is " + sum);
    }

    static String Greet(String name) {
        return "Hello " + name;
    }
}


    
