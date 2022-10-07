package com.sorting;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        int n = arr.length;
        cycleSort(arr);
        System.out.println("After sort : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if(arr[correct_index] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else {
                i++;
            }
        }
    }
}
