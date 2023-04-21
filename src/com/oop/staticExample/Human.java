package com.oop.staticExample;

public class Human {
  int age;
  String name;
  int salary;
  boolean married;
  static long population;

  static void message() {
    System.out.println("Hello World");
    // System.out.println(this.age);  // Cannot use this in a static method as "this" refers to an object
  }

  public Human(int age, String name, int salary, boolean married) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.married = married;
    Human.population += 1;

    Human.message();
  }
}
