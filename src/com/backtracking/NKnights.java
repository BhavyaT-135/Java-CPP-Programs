package com.backtracking;

public class NKnights {
  public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    int ans = nKnights(board, 0);
    System.out.println(ans);
    knight(board, 0, 0, 5);
  }

  static int nKnights(boolean[][] board, int row) {
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
        count += nKnights(board, row + 1);
        board[row][col] = false;
      }
    }

    return count;
  }

  static void knight(boolean[][] board, int row, int col, int knights) {
    if (knights == 0) {
      display(board);
      System.out.println();
    }

    if (row == board.length - 1 & col == board.length) {
      return;
    }

    if (col == board.length) {
      knight(board, row + 1, 0, knights);
      return;
    }

    if (isSafe(board, row, col)) {
      board[row][col] = true;
      knight(board, row, col + 1, knights - 1);
      board[row][col] = false;
    }

    knight(board, row, col + 1, knights);
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    // Check 1 row above and 2 cols back
    if (row > 0 && col > 1) {
      if (board[row - 1][col - 2] == true) {
        return false;
      }
    }
    
    // Check 1 row above and 2 cols forward
    if (row > 0 && col + 2 < board.length) {
      if (board[row - 1][col + 2] == true) {
        return false;
      }
    }
    
    // Check 2 rows above and 1 col back
    if (row > 1 && col > 0) {
      if (board[row - 2][col - 1] == true) {
        return false;
      }
    }

    // Check 2 rows above and 1 col back
    if (row > 1 && col + 1 < board.length) {
      if (board[row - 2][col + 1] == true) {
        return false;
      }
    }

    return true;
  }

  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean element : row) {
        if (element) {
          System.out.print("K ");
        } else {
          System.out.print("X ");
        }
      }
      System.out.println();
    }
  }
}
