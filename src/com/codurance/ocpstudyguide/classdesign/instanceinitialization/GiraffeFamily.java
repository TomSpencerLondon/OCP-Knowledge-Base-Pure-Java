package com.codurance.ocpstudyguide.classdesign.instanceinitialization;

public class GiraffeFamily {
  static {
    System.out.print("A");
  }

  {
    System.out.print("B");
  }

  public GiraffeFamily(String name) {
    this(1);
    System.out.print("C");
  }

  public GiraffeFamily() {
    System.out.print("D");
  }
  public GiraffeFamily(int stripes) {
    System.out.print("E");
  }
}
