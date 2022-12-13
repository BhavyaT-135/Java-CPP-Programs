package com.problems;

public class FindAverage {
    public static void main(String[] args) {
        int[] nums = { 0 };
        System.out.println(findAverage(nums));
    }

    public static float findAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int maxCount = 0;
        int minCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                maxCount++;
            }
            if (nums[i] == min) {
                minCount++;
            }
        }

        float average = (float)(max * maxCount + min * minCount) / (maxCount + minCount);
        return average;
    }
}
