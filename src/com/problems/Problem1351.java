package com.problems;

public class Problem1351 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(countNegatives(matrix));
    }

    static int countNegatives(int[][] grid) {

        Integer counter = 0;
        for (int[] i : grid) {
            int head = 0, tail = i.length - 1;
            while (head <= tail) {
                int mid = (head + tail) / 2;
                if (i[mid] < 0 && (mid == 0 || i[mid - 1] >= 0)) {
                    counter += i.length - mid;
                    break;
                } else if (i[mid] >= 0)
                    head = mid + 1;
                else
                    tail = mid - 1;
            }
        }

        return counter;
    }
}
