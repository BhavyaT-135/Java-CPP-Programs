package com.problems;

public class Problem1051 {
    public static void main(String[] args) {
        int[] arr = { 1,1,4,2,1,3 };
        System.out.println(heightChecker(arr));
    }

    static int heightChecker(int[] heights) {
        int sorted[] = new int[heights.length];

        for (int j = 0; j < heights.length; j++) {
            sorted[j] = heights[j];
        }

        bubbleSort(sorted);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }

    static void bubbleSort(int[] nums) {
        boolean swapped = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
