package com.problems;

public class Problem55 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
    
    static boolean canJump(int[] nums) {
        boolean ans = false;
        int max = 0;
        int i = 0;
        while (i <= max && i <= nums.length - 1) {
            if (i + nums[i] >= max) {
                max = i + nums[i];
            }
            if (max >= nums.length - 1) {
                ans = true;
            }
            i++;
        }
        return ans;
    }
}
