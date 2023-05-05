package com.oop.abstractDemo;

public class Son extends Parent {
  
  public Son(int age) {
    super(age);
  }

  @Override
  void career(String name) {
    System.out.println("My son's career is " + name);
  }

  @Override
  void partner(String name, int age) {
    System.out.println("My son's partner is " + name + " and she is " + age + " years old");
  }
}
