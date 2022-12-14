package com.temp;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void enqueue(int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = value;
                break;
            }
        }
    }

    public int dequeue() {
        int value = 0;
        for (int i = 0; i < data.length; i++) {
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
        for (int i = 0; i < data.length; i++) {
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
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();
        System.out.println(queue.dequeue());
        queue.print();
        System.out.println(queue.peek());
        queue.print();
    }
}
