package com.stack_queue;

import java.util.*;

public class stackArray {
  static class stack {
    int size = 1000;
    int top = -1;
    int[] arr = new int[size];

    void push(int x) {
      top++;
      arr[top] = x;
    }

    int pop() {
      int x = arr[top];
      top--;
      return x;
    }

    int top() {
      return arr[top];
    }

    int size() {
      return top + 1;
    }
  }
  
  public static void main(String[] args) {
    stack temp = new stack();
    temp.push(6);
    temp.push(3);
    temp.push(7);
    System.out.println("Top of the stack before deleting any element " + temp.top());
    System.out.println("Size of the stack before deleting any element " + temp.size());
    System.out.println("The element deleted is " + temp.pop());
    System.out.println("Size of the stack after deleting an element " + temp.size());
    System.out.println("Top of the stack after deleting an element " + temp.top());
  }
}
