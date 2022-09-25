package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 1, 3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //Find the maximum element in the unsorted array
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            //Swap the maximum element with the last element of the unsorted array
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
