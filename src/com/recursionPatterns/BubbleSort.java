package com.recursionPatterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 2, 8, 3, 7, 9, 0 };
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            sort(arr, row, ++col);
        }
        else {
            sort(arr, --row, 0);
        }
    }
}
