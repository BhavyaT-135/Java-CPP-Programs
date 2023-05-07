package com.oop.interfaces;

public class ElectricEngine implements Engine {
  @Override
  public void start() {
    System.out.println("ElectricEngine started");
  }

  @Override
  public void stop() {
    System.out.println("ElectricEngine stopped");
  }

  @Override
  public void acc() {
    System.out.println("ElectricEngine acc");
  }
}