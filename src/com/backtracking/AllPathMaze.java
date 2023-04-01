package com.backtracking;

public class AllPathMaze {
  public static void main(String[] args) {
    boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
    path("", maze, 0, 0);
  }

  static void path(String p, boolean[][] maze, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }

    // Condition for obstacle
    if (maze[r][c] == false) {
      return;
    }

    maze[r][c] = false;

    if (r < maze.length - 1) {
      path(p + 'D', maze, r + 1, c);
    }
    if (r > 0) {
      path(p + 'U', maze, r - 1, c);
    }    
    if (c < maze[0].length - 1) {
      path(p + 'R', maze, r, c + 1);
    }
    if (c > 0) {
      path(p + 'L', maze, r, c - 1);
    }

    maze[r][c] = true;
    
  }
}
