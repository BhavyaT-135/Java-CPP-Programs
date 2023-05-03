package com.oop.objectClass;

public class ObjectDemo {

  int num;

  public ObjectDemo(int num){
    this.num = num;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  // @Override
  // protected void finalize() throws Throwable {
  //   super.finalize();
  // }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  // @Override
  // public Class<?> getClass() {
  //   return super.getClass();
  // }

  public static void main(String[] args) {
    ObjectDemo obj = new ObjectDemo(34);
    ObjectDemo obj2 = new ObjectDemo(45);
    ObjectDemo obj3 = obj;

    System.out.println(obj.hashCode());

    if (obj.equals(obj3)) {
      System.out.println("The objects are equal");
    }
    else {
      System.out.println("The objects are not equal");
    }

    System.out.println(obj.getClass());
  }
}
