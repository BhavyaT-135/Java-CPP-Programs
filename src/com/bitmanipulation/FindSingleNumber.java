package com.bitmanipulation;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 1, 3, 2, 3 };
        System.out.println("Single number is: " + findSingleNumber(nums));
    }
    
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
