package com.backtracking;

import java.util.ArrayList;

public class MazePath {
  public static void main(String[] args) {
    mazePath("", 3, 3);
    System.out.println(path("", 3, 3));
    mazePath2("", 3, 3);
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
      mazePath(p + 'R', r, c - 1);
    }
  }
  
  static ArrayList<String> path(String p, int r, int c) {
    if (r == 1 && c == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> list = new ArrayList<>();

    if (r > 1) {
      list.addAll(path(p + 'D', r - 1, c));
    }
    if (c > 1) {
      list.addAll(path(p + 'R', r, c - 1));
    }

    return list;
  }
  
  // Allowing diagonal movement as well
  static void mazePath2(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }
    if (r > 1 && c > 1) {
      mazePath2(p + "Di", r - 1, c-1);
    }
    if (r > 1) {
      mazePath2(p + 'D', r - 1, c);
    }
    if (c > 1) {
      mazePath2(p + 'R', r, c - 1);
    }
  }
}
