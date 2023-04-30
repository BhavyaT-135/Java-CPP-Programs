package com.oop.polymorphism;

public class Numbers {
  
  static void sum(int a, int b) {
    System.out.println("Sum of two numbers is " + (a + b));
  }

  static void sum(int a, int b, int c) {
    System.out.println("Sum of three numbers is " + (a + b + c));
  }
  
  public static void main(String[] args) {
    sum(2, 3);
    sum(2, 3, 4); 
  }
}
