package com.oop.singleton;

public class Main {
  public static void main(String[] args) {
    Singleton obj = Singleton.getInstance();
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    System.out.println(obj);
  }
}
