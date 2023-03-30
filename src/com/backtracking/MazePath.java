package com.backtracking;

public class MazePath {
  public static void main(String[] args) {
    mazePath("", 3, 3);
  }
  
  static void mazePath(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }
    if (r > 1) {
      mazePath(p + 'D', r - 1, c);
    }
    if (c > 1) {
      mazePath(p + 'R', r, c-1);
    }
  }
}
