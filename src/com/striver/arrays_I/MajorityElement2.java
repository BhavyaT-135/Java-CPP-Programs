package com.striver.arrays_I;

import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        List<Integer> list = majorityElement(arr);
        System.out.println(list);
    }
    
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for (int x : mp.keySet()) {
            if (mp.get(x) > (n / 3))
                list.add(x);
        }

        return list;
    }

}
