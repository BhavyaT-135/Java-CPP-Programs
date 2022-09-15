package com.problems;

public class Problem540 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    
    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        if (n == 1 || nums[1] != nums[0])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if (nums[mid] == nums[mid - 1] && mid % 2 == 0 || nums[mid] != nums[mid - 1] && mid % 2 == 1)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
