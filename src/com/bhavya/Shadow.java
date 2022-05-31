package com.bhavya;

import java.util.Scanner;

public class Shadow {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x =40;          
        System.out.println(x);      // Here, x=40 shadows x=90 because lower scope overrides higher scope.
        fun();
    }

    static void fun () {
        System.out.println(x);
    }
}