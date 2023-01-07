package com.recursionArrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 8, 2, 8, 99, 45, 3, 9, 23 };
        int target = 45;
        System.out.println("Index of the target element is " + linearSearch(arr, target, 0));
        linearSearchAll(arr, target, 0);
        System.out.println(list);
    }
    
    static int linearSearch(int[] arr, int target, int i) {
        if (arr[i] == target) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return linearSearch(arr, target, ++i);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearchAll(int[] arr, int target, int i) {
        if (arr[i] == target) {
            list.add(i);
        }
        if (i == arr.length - 1) {
            return;
        }
        linearSearchAll(arr, target, ++i);
    }
}
