package com.striver.arrays_I;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
        int msf = Integer.MIN_VALUE, meh = 0;
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            meh += nums[i];

            if (meh > msf) {
                msf = meh;
            }
            if (meh < 0) {
                meh = 0;
                s = i + 1;

            }
        }
        return msf;
    }
}
