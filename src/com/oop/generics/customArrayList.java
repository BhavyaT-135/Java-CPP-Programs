package com.oop.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {

  private int[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0; // Also works as an index for the Array List

  public customArrayList() {
    this.data = new int[DEFAULT_SIZE];
  }

  public void add(int num) {
    if (this.isFull()) {
      resize();
    }
    data[size++] = num;
  }

  private void resize() {
    int[] temp = new int[data.length * 2];

    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }

    data = temp;
  }

  private boolean isFull() {
    return size == data.length;
  }

  public int remove() {
    int removed = data[--size];
    return removed;
  }

  public int get(int index) {
    return data[index];
  }

  public int size() {
    return size;
  }

  public void set(int index, int value) {
    data[index] = value;
  }

  @Override
  public String toString() {
    return "Custom ArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
  }

  public static void main(String[] args) {
    // ArrayList list = new ArrayList();
    customArrayList list = new customArrayList();
    list.add(10);
    list.add(20);
    list.add(30);
    
    System.out.println(list);
  }
}
