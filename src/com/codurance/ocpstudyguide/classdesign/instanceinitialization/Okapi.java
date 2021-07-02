package com.codurance.ocpstudyguide.classdesign.instanceinitialization;

public class Okapi extends GiraffeFamily {
  static {
    System.out.print("F");
  }

  public Okapi(int stripes) {
    super("sugar");
    System.out.print("G");
  }

  {
    System.out.println("H");
  }

  public static void main(String[] args) {
    new Okapi(1);
    System.out.println();
    new Okapi(2);
  }
}
