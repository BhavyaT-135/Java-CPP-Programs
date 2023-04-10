package com.oop;

public class ClassConcepts {

  static class A {
    final int rno = 5;
    String name;

    A(String name) {
      this.name = name;
    }
  }


   static class Student {
    int rno;
    String name;
    float marks;

    Student() {
      this.rno = 0;
      this.name = " ";
      this.marks = 0;
    }

    Student(int rno, String name, float marks) {
      this.rno = rno;
      this.name = name;
      this.marks = marks;
    }
    
    Student(Student other) {
      this.name = other.name;
      this.rno = other.rno;
      this.marks = other.marks;
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

    final A temp = new A("Einstein");
    temp.name = "Albert";
    System.out.println(temp.name + " " + temp.rno);
  }
}
