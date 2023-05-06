package com.oop.interfaces;

public class Car implements Engine, Brake {
  @Override
  public void start() {
    System.out.println("Car started");
  }

  @Override
  public void stop() {
    System.out.println("Car stopped");
  }

  @Override
  public void brake() {
    System.out.println("Car braked");
  }

  @Override
  public void acc() {
    System.out.println("Car accelerated");
  }
}
