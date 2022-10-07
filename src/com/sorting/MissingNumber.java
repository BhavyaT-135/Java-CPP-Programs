package com.sorting;

//In this question, we are given an array of integers from 0 to n, but one of the numbers is missing. We need to find the missing number. We will use Cycle Sort to solve this.
public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 4, 0, 2, 1 };
        System.out.println("Missing number is: " + missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct_index = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct_index]) {
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}