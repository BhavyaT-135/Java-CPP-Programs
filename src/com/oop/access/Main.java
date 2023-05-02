package com.oop.access;

public class Main {
  public static void main(String[] args) {
    A obj = new A(13, "Bhavya Tewari");
    // Need to do a few things
    // 1. Access the data members
    // 2. Modify the data members
    System.out.println(obj.getNum());
    obj.setNum(14);
    System.out.println(obj.getNum());
  }
}
