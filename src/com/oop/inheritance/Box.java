package com.oop.inheritance;

public class Box {
  double l;
  double h;
  double w;

  Box() {
    this.h = -1;
    this.w = -1;
    this.l = -1;
  }

  // Cube
  Box(double side) {
    this.h = side;
    this.w = side;
    this.l = side;
  }

  Box(double l, double w, double h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }

  // Copy object constructor
  Box(Box old) {
    this.l = old.l;
    this.w = old.w;
    this.h = old.h;
  }

  public void information() {
    System.out.println("Running the box");
  }
}
