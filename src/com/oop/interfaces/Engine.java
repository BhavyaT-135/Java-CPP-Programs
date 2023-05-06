package com.oop.interfaces;

public interface Engine {

  int PRICE = 78000; // Static final by default

  void start();
  
  void stop(); // public abstract by default
  
  void acc();
}
