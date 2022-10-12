package com.striver.arrays_I;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 3 }, { 4, 5, 2 }, { 7, 8, 9 } };
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int dummy1[] = new int[rows];
        int dummy2[] = new int[cols];
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dummy1[i] == 0 || dummy2[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
