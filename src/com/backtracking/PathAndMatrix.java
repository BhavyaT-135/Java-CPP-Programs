package com.backtracking;

public class PathAndMatrix {
  public static void main(String[] args) {
    boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
    int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
    path("", maze, 0, 0, 1, arr);
  }
  
  static void path(String p, boolean[][] maze, int r, int c, int step, int[][] arr) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println();
      System.out.println(p);
      arr[r][c] = step;
      for(int i=0; i<arr.length; i++){
        for (int j = 0; j < arr[0].length; j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
      return;
    }

    if (maze[r][c] == false) {
      return;
    }

    maze[r][c] = false;
    arr[r][c] = step;

    if (r < maze.length - 1) {
      path(p + 'D', maze, r + 1, c, step + 1, arr);
    }
    if (r > 0) {
      path(p + 'U', maze, r - 1, c, step + 1, arr);
    }
    if (c < maze[0].length - 1) {
      path(p + 'R', maze, r, c + 1, step + 1, arr);
    }
    if (c > 0) {
      path(p + 'L', maze, r, c - 1, step + 1, arr);
    }

    maze[r][c] = true;
    arr[r][c] = 0;

  }
}
