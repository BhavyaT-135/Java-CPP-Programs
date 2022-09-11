package com.array;

public class Problem410 {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // In the end of the loop this will contain the max item from the array
            end += nums[i]; // In the end of the loop this will contain the sum of all the items in the
                            // array
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum > mid) {
                    sum = nums[i];
                    pieces++;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // Here start == end
    }
}
