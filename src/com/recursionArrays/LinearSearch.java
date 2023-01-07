package com.recursionArrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 8, 2, 8, 99, 45, 3, 9, 23 };
        int target = 45;
        System.out.println("Index of the target element is " + linearSearch(arr, target, 0));
        linearSearchAll(arr, target, 0);
        System.out.println(list);
        System.out.println(linearSearchAll2(arr, target, 0));
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

    static ArrayList<Integer> linearSearchAll2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {

            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = linearSearchAll2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
