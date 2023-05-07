package com.oop.interfaces.extendDemo;

public class Main implements B {
  @Override
  public void fun() {
    System.out.println("Let's have some fun!");
  }

  @Override
  public void greet() {
    System.out.println("Greetings!");
  }
}
