package com.array;

public class PeakMountainArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (start > end) {
            return -1;
        }

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (mid == 0) {
                start = mid + 1;
            }

            else if (mid == (arr.length - 1)) {
                end = mid - 1;
            }

            else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
