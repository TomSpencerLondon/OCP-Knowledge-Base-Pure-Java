package com.codurance.ocpstudyguide.classdesign.orderofinitialization;

public class Hippo extends Animal {
  static {
    System.out.println("B");
  }

  public static void main(String[] args) {
    System.out.println("C");
    new Hippo();
    new Hippo();
    new Hippo();
  }
}
