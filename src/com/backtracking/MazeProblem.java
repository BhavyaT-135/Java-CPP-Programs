package com.backtracking;

public class MazeProblem {
  public static void main(String[] args) {
    int size = 2;
    System.out.println(mazeSolver(size, size));
  }

  static int mazeSolver (int row, int col) {
    if(row == 1 || col == 1){
      return 1;
    }

    int sum = mazeSolver(row-1, col) + mazeSolver(row, col-1);
    return sum;
  }
}