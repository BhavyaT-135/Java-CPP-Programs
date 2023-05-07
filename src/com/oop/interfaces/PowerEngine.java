package com.oop.interfaces;

public class PowerEngine implements Engine {
  @Override
  public void start() {
    System.out.println("PowerEngine started");
  }

  @Override
  public void stop() {
    System.out.println("PowerEngine stopped");
  }

  @Override
  public void acc() {
    System.out.println("PowerEngine acc");
  }
}
