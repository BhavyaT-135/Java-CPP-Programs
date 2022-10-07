package com.sorting;

import java.util.Arrays;
import java.util.ArrayList;

public class FindAllMissing{
    public static void main(String[] args) {
        int arr[] = { 5, 2, 6, 1, 2, 6 };
        System.out.println(Arrays.toString(findMissing(arr).toArray()));
    }

    static ArrayList<Integer> findMissing(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        //Find all missing numbers
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                missingNumbers.add(j + 1);
            }
        }
        return missingNumbers;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}