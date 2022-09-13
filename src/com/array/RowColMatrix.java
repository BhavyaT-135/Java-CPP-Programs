package com.array;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(Arrays.toString(search(matrix, 8)));
    }

    static int[] search(int[][] matrix, int target) {
        int[] ans = { -1, -1 };
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return ans;
    }
}
