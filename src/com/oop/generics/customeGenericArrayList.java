package com.oop.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customeGenericArrayList<T> {

  private Object[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0; // Also works as an index for the Array List

  public customeGenericArrayList() {
    this.data = new Object[DEFAULT_SIZE];
  }

  public void add(T num) {
    if (this.isFull()) {
      resize();
    }
    data[size++] = num;
  }

  private void resize() {
    Object[] temp = new Object[data.length * 2];

    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }

    data = temp;
  }

  private boolean isFull() {
    return size == data.length;
  }

  public T remove() {
    T removed = (T)(data[--size]);
    return removed;
  }

  public T get(int index) {
    return (T)(data[index]);
  }

  public int size() {
    return size;
  }

  public void set(int index, T value) {
    data[index] = value;
  }

  @Override
  public String toString() {
    return "Custom ArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
  }

  public static void main(String[] args) {
    // ArrayList list = new ArrayList();
    customeGenericArrayList<Integer> list = new customeGenericArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);
  }
}
