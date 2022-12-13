package com.problems;

public class FindCount {
    public static void main(String[] args) {
        int[] nums = { 0,1,4,3 };
        System.out.println(findCount(nums));
    }

    public static int findCount(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int average = sum / nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == average) {
                count++;
            }
        }
        return count;
    }
}
