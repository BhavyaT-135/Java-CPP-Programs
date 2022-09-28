package com.problems;

import java.util.Arrays;

public class Problem1838 {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(maxFrequency(arr, 5));
    }

    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int i=0, res=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(sum+k<(long)(nums[j]*(j-i+1))) sum-=nums[i++];
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}
