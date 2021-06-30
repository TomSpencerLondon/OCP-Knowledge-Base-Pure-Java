package com.codurance.ocpstudyguide.staticversusinstance;

public class Static {
  private String name = "Static class";
  public static void first() {}
  public static void second() {}
  public void third() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    first();
    second();
    // doesn't compile because it is a
    // non static method referenced in static
    // method
//    third();
  }
}
