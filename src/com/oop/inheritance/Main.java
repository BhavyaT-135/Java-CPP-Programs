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
    
    // BoxWeight box2 = new BoxWeight(2, 3, 4, 5);
    // box2.information();
    // System.out.println(box2.l + " " + box2.h);

    Box box3 = new BoxWeight(2, 3, 4, 5);
    // It is actually the type of the reference variable and not the type of object that determines what properties can be accessed.
    // System.out.println(box3.weight); // Thus, this would give an error

    // BoxWeight box4 = new Box(2, 3, 4); // This would also give an error as a child class can't reference a parent class 
  }
}