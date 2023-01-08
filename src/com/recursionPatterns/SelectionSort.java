package com.recursionPatterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 3, 7, 2, 8, 9 };
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr, int row, int col, int maxIndex){
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[maxIndex] < arr[col]) {
                maxIndex = col;
            }
            sort(arr, row, ++col, maxIndex);
        }
        else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row-1];
            arr[row-1] = temp;
            sort(arr, --row, 0, 0);
        }
    }
}
