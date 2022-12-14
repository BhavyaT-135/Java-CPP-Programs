package com.temp;

public class DL {
    private Node head;
    private Node tail;
    private int size;

    public DL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        this.size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
        this.size++;
    }

    public Node getNodeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Invalid index");
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertAt(int value, int index) {
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            insertFirst(value);
        } else if (index == this.size) {
            insertLast(value);
        } else {
            Node node = new Node(value);
            Node prev = getNodeAt(index - 1);
            node.next = prev.next;
            node.prev = prev;
            prev.next = node;
            node.next.prev = node;
            this.size++;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        Node temp = this.tail;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public int removeFirst() {
        if (this.size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int value = this.head.value;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
        }
        this.size--;
        return value;
    }

    public int removeLast() {
        if (this.size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int value = this.tail.value;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        this.size--;
        return value;
    }

    public int removeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == this.size - 1) {
            return removeLast();
        } else {
            Node prev = getNodeAt(index - 1);
            int value = prev.next.value;
            prev.next = prev.next.next;
            prev.next.prev = prev;
            this.size--;
            return value;
        }
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DL list = new DL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(60);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);
        list.display();
        list.displayReverse();
        list.removeFirst();
        list.removeLast();
        list.removeAt(2);
        list.display();
        list.displayReverse();
    }
}
