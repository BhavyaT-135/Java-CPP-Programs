package com.array;

public class Problem34 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
        int[] ans = searchRange(arr, 2);
        System.out.println(ans[0] + " " + ans[1]);
    }

    static public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        if (nums.length == 0) {
            return ans;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                int left = mid;
                int right = mid;
                while (left >= 0 && nums[left] == target) {
                    left--;
                }
                while (right < nums.length && nums[right] == target) {
                    right++;
                }
                ans[0] = left + 1;
                ans[1] = right - 1;
                return ans;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}