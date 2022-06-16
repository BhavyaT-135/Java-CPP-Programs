package com.array;

import java.lang.Math;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        long input = 0;
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            input = input + (int) (digits[i] * Math.pow(10, j));
            j++;
        }
        // System.out.println(input);
        input = input + 1;
        System.out.println(input);
        int sizeNew = ((int) (Math.log10(input))) + 1;
        int ans[] = new int[sizeNew];
        for (int k = sizeNew - 1; k >= 0; k--) {
            ans[k] = (int) (input % 10);
            input = input / 10;
        }
        return ans;
    }

}
