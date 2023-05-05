package com.oop.abstractDemo;

public class Daughter extends Parent {

  public Daughter(int age) {
    super(age);
  }

  @Override
  void career(String name) {
    System.out.println("My daughter's career is " + name);
  }

  @Override
  void partner(String name, int age) {
    System.out.println("My daughter's partner is " + name + " and he is " + age + " years old");
  }
}
