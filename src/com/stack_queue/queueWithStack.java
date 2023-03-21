package com.stack_queue;

import java.util.Stack;

public class queueWithStack {
  public static void main(String[] args) {
    Queue q = new Queue();
    q.push(3);
    q.push(4);
    System.out.println("The element poped is " + q.pop());
    q.push(5);
    System.out.println("The top element is " + q.top());
    System.out.println("The size of the queue is " + q.size());
  }
}

class Queue {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  void push(int x) {
    if (stack1.empty()) {
      stack1.push(x);
      System.out.println("The element pushed is " + x);
    } else {
      while(!stack1.empty()) {
        stack2.push(stack1.peek());
        stack1.pop();
      }
      stack2.push(x);
      System.out.println("The element pushed is " + x);
      while (!stack2.empty()) {
        stack1.push(stack2.peek());
        stack2.pop();
      }
    }
  }
  
  int top() {
    if (stack1.empty()) {
        System.out.println("Stack is empty");

    }
    return stack1.peek();
  }

  int pop() {
    if (stack1.empty()) {
      System.out.println("Stack is empty");

    }
    int val = stack1.peek();
    stack1.pop();
    return val;
  }

  int size() {
    return stack1.size();
  }
}
