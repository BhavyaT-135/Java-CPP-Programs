package com.temp;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = value;
                break;
            }
        }
    }

    public int pop() {
        int value = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] != 0) {
                value = data[i];
                data[i] = 0;
                break;
            }
        }
        return value;
    }

    public int peek() {
        int value = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] != 0) {
                value = data[i];
                break;
            }
        }
        return value;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        System.out.println(Arrays.toString(stack.data));
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.print();
    }
}
