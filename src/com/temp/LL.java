package com.temp;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
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
            prev.next = node;
            this.size++;
        }
    }

    public int removeFirst() {
        if (this.size == 0) {
            throw new IllegalArgumentException("List is empty");
        }
        int value = this.head.value;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return value;
    }

    public int removeLast() {
        if (this.size == 0) {
            throw new IllegalArgumentException("List is empty");
        }
        int value = this.tail.value;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node secondLast = getNodeAt(this.size - 2);
            secondLast.next = null;
            this.tail = secondLast;
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
            this.size--;
            return value;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < this.size - 1; i++) {
            for (int j = 0; j < this.size - i - 1; j++) {
                Node first = getNodeAt(j);
                Node second = getNodeAt(j + 1);
                if (first.value > second.value) {
                    int temp = first.value;
                    first.value = second.value;
                    second.value = temp;
                }
            }
        }
    }

    public void insertSort() {
        for (int i = 1; i < this.size; i++) {
            Node temp = getNodeAt(i);
            int j = i - 1;
            while (j >= 0 && getNodeAt(j).value > temp.value) {
                getNodeAt(j + 1).value = getNodeAt(j).value;
                j--;
            }
            getNodeAt(j + 1).value = temp.value;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(Node head){
        if(head == null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.value + " --> ");
    }

    private class Node {

        // private members can be accessed only by the class

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(60);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);
        list.insertAt(100, 5);
        list.display();
        list.bubbleSort();
        list.display();
        System.out.println(list.getNodeAt(4).value);
        System.out.println(list.size);
        list.displayReverse(list.head);
    }
}
