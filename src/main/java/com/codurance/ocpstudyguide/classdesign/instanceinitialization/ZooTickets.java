package com.codurance.ocpstudyguide.classdesign.instanceinitialization;

public class ZooTickets {
  private String name = "BestZoo";
  {
    System.out.println(name + "-");
  }

  private static int COUNT = 0;

  static {
    System.out.println(COUNT + "-");
  }

  static {
    COUNT += 10;
    System.out.println(COUNT + "-");
  }

  public ZooTickets() {
    System.out.println("z-");
  }

  public static void main(String... patrons) {
    // instance initializer is called before the constructor
    // otherwise the two static calls are made one after the other
    // in order
    new ZooTickets();
  }
}
