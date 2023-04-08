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
  }
  
  public static void main(String[] args) {
    Student bhavya = new Student();
    bhavya.marks = 100;
    bhavya.rno = 5;
    bhavya.name = "Bhavya Tewari";
    System.out.println(bhavya.marks);
    System.out.println(bhavya.rno);
    System.out.println(bhavya.name);

    Student abhinav = new Student();
    System.out.println(abhinav.marks);
    System.out.println(abhinav.rno);
    System.out.println(abhinav.name);
  }
}
