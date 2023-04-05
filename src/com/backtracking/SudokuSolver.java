package com.backtracking;

public class SudokuSolver {
  public static void main(String[] args) {
    char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

    if (sudoku(board)) {
      display(board);
    } else {
      System.out.println("Cannot solve");
    }
  }

  static boolean sudoku(char[][] board) {
    
    int n = board.length;
    int row = -1;
    int col = -1;

    boolean emptyLeft = true;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == '.') {
          row = i;
          col = j;
          emptyLeft = false;
          break;
        }
      }
      if (emptyLeft == false) {
        break;
      }
    }
    
    if (emptyLeft == true) {
      return true;
    }

    for (int k = 1; k <= 9; k++) {
      if (isSafe(board, row, col, k)) {
        board[row][col] = (char) ('0' + k);
        if (sudoku(board)) {
          return true;
        } else {
          board[row][col] = '.';
        }
      }
    }
    return false;
  }

  private static boolean isSafe(char[][] board, int row, int col, int num) {
    for (int i = 0; i < board.length; i++) {
      // check if the number is in the row
      if (board[row][i] == (char) (num + '0')) {
        return false;
      }
    }

    // check the col
    for (char[] rows : board) {
      // check if the number is in the col
      if (rows[col] == (char)(num+'0')) {
        return false;
      }
    }

    int sqrt = (int) (Math.sqrt(board.length));
    int rowStart = row - row % sqrt;
    int colStart = col - col % sqrt;

    for (int r = rowStart; r < rowStart + sqrt; r++) {
      for (int c = colStart; c < colStart + sqrt; c++) {
        if (board[r][c] == (char) (num + '0')) {
          return false;
        }
      }
    }
    return true;
  }

  private static void display(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
}
