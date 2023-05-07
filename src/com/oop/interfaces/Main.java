package com.oop.interfaces;

public class Main {
  public static void main(String[] args) {
    // Car car = new Car();
    // car.start();
    // car.stop();
    // car.acc();
    // car.brake();

    NiceCar car = new NiceCar();

    car.start();
    car.startMusic();
    car.upgradeEngine();
    car.start();
  }
}
