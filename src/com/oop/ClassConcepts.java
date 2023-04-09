package com.oop;

public class ClassConcepts {
  
   static class Student {
    int rno;
    String name;
    float marks;

    Student() {
      this.rno = 0;
      this.name = " ";
      this.marks = 0;
    }

    Student (int rno, String name, float marks) {
      this.rno = rno;
      this.name = name;
      this.marks = marks;
    }

    void greeting() {
      System.out.println("Hi, my name is " + this.name);
    }

    void changeName(String name) {
      this.name = name;
    }
  }
  
  public static void main(String[] args) {
    Student bhavya = new Student();
    bhavya.marks = 100;
    bhavya.rno = 5;
    bhavya.name = "Bhavya Tewari";
    System.out.println(bhavya.marks);
    System.out.println(bhavya.rno);
    System.out.println(bhavya.name);
    bhavya.greeting();

    Student abhinav = new Student();
    System.out.println(abhinav.marks);
    System.out.println(abhinav.rno);
    System.out.println(abhinav.name);
    abhinav.greeting();

    Student gaurav = new Student(12, "Gaurav Dubey", 88.75f);
    System.out.println(gaurav.marks);
    System.out.println(gaurav.rno);
    System.out.println(gaurav.name);
    gaurav.greeting();
  }
}
