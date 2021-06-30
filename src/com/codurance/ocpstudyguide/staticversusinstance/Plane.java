package com.codurance.ocpstudyguide.staticversusinstance;

public class Plane {
  public void fly(int i) {
    System.out.print("int");
  }

  public void fly(long l) {
    System.out.print("long");
  }

  public static void main(String[] args) {
    Plane plane = new Plane();
    plane.fly(123);
    System.out.print("-");
    plane.fly(123L);
  }
}
