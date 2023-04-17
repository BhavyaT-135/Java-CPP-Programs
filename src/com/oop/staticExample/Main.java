package com.oop.staticExample;

public class Main {
  public static void main(String[] args) {
    Human bhavya = new Human(21, "Bhavya", 200000, true);
    Human rahul = new Human(21, "Rahul", 200000, true);
    System.out.println(bhavya.population);
    System.out.println(rahul.population);
    System.out.println(Human.population); // Convention to use class name to reference static variables.
  }
}