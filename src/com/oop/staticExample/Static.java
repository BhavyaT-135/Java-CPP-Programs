package com.oop.staticExample;

public class Static {
  static int a = 4;
  static int b;

  static {
    System.out.println("I am a static block");
    b = a * 5;
  }

  public static void main(String[] args) {
    System.out.println(Static.b);
  }

}
