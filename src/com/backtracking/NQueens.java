package com.backtracking;

public class NQueens {
  public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    int ans = nQueens(board, 0);
    System.out.println(ans);
  }

  static int nQueens(boolean[][] board, int row) {
    if (row == board.length) {
      display(board);
      System.out.println();
      return 1;
    }

    int count = 0;
    // Placing the queen and checking for every row and column
    for (int col = 0; col < board.length; col++) {
      // Place the queen if it is safe
      if (isSafe(board, row, col)) {
        board[row][col] = true;
        count += nQueens(board, row + 1);
        board[row][col] = false;
      }
    }

    return count;
  }
  
  private static boolean isSafe(boolean[][] board, int row, int col){
    // Check vertical row
    for(int i = 0; i < row; i++){
      if(board[i][col]){
        return false;
      }
    }

    // Left diagonal
    int maxLeft = Math.min(row, col);
    for(int i = 1; i <= maxLeft; i++){
      if(board[row-i][col-i] == true){
        return false;
      }
    }

    // Right diagonal
    int maxRight = Math.min(row, board.length - col -1);
    for(int i = 1; i <= maxRight; i++){
      if(board[row-i][col+i] == true){
        return false;
      }
    }

    return true;
  }

  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean element : row) {
        if (element) {
          System.out.print("Q ");
        } else {
          System.out.print("X ");
        }
      }
      System.out.println();
    }
  }
}
