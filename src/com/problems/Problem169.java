package com.problems;

import java.util.Arrays;

public class Problem169 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }
    
    //After sorting the array, the number that is repeated more than n/2 times will be at the middle index
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
