package com.bitmanipulation;

public class FindSingleNumber2 {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 1, 3, 2, 3, 1, 2, 3 };
        System.out.println("Single number is: " + findSingleNumber(nums));
    }
    
    public static int findSingleNumber(int[] nums) {
        // Adding up all the bits at each position and mod 3
        // If the result is 1, then the single number has a 1 at that position
        // If the result is 0, then the single number has a 0 at that position
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (findIthBit(nums[j], i)) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result = result | (1 << i);
            }
        }
        return result;
    }

    public static boolean findIthBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }
}
