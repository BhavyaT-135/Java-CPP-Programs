package com.oop.interfaces;

public class CDPlayer implements Media{
  @Override
  public void start() {
    System.out.println("CDPlayer started");
  }
  
  @Override
  public void stop() {
    System.out.println("CDPlayer stopped");
  }
}
