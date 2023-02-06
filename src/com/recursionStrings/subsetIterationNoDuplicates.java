package com.recursionStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class subsetIterationNoDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2 };
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans.toString());
    }

    static List<List<Integer>> subset(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
