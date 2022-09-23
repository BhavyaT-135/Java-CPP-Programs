package com.problems;

public class Problem1539 {
    public static void main(String[] args) {
        int[] nums = { 2,3,4,7,11 };
        System.out.println(findKthPositive(nums, 5));
    }

    static int findKthPositive(int[] arr, int k) {
        
        int start = 0;
        int end = arr.length;
        
        while(start<end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] - (mid+1) >= k){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start+k;
    }

}
