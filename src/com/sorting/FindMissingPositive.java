package com.sorting;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr = { -1, 4, 2, 1, 9, 10 };
        System.out.println(findMissingPositive(arr));
    }

    public static int findMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct_index]) {
                if (arr[correct_index] != arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[correct_index];
                    arr[correct_index] = temp;
                }
            } else {
                i++;
            }
        }

        int ans = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0 && arr[j] == ans) {
                ans++;
            } else if(arr[j] > 0 && arr[j] != ans) {
                break;
            }
        }
        return ans;
    }
}
