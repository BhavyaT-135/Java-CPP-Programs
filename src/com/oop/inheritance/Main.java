package com.oop.inheritance;

public class Main {
  public static void main(String[] args) {
    // Box box = new Box(2, 3, 4);
    // Box cube = new Box(2);
    // box.information();
    // System.out.println(cube.l);
    
    // BoxWeight box = new BoxWeight();
    // System.out.println(box.weight);
    // System.out.println(box.l);
    // System.out.println(box.h);
    // System.out.println(box.w);
    
    BoxWeight box2 = new BoxWeight(2, 3, 4, 5);
    box2.information();
    System.out.println(box2.l + " " + box2.h);
  }
}