package com.problems;

public class Problem1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
    
    static int diagonalSum(int[][] mat) {
        int ans = 0;
        for(int i=0; i <= mat.length -1; i++){
            ans += mat[i][i];
            ans += mat[i][mat.length - 1 - i];
        }
        if(mat.length%2 != 0){
            ans = ans - mat[mat.length/2][mat.length/2];   
        }
        return ans;
    }
}
