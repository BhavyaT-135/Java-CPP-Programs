package com.bhavya;

import java.util.Scanner;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0]  = 17;
    }
}