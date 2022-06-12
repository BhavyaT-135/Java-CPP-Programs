package com.array;

public class PositionInInfiniteArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(findingRange(arr, 3));
    }

    static int findingRange(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        int ans = -1;

        if (arr[0] == target) {
            return 0;
        }

        if (arr[1] == target) {
            return 1;
        }

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // end-start+1 is the size of the box
            end = end + ((end - start + 1) * 2);
            ans = searchRange(arr, target, newStart, end);
            start = newStart;
        }
        return ans;
    }

    static int searchRange(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
