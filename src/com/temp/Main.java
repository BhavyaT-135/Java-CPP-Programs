package com.temp;

public class Main {
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
        list.display();
    }
}