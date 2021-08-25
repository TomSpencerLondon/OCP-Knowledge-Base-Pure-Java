package com.codurance.ocpstudyguide.classdesign.instanceinitialization;

public class Cuttlefish {
  private String name = "swimmy";
  {
    System.out.println(name);
  }
  private static int COUNT = 0;

  static {
    System.out.println(COUNT);
  }

  {
    COUNT++;
    System.out.println(COUNT);
  }

  public Cuttlefish() {
    System.out.println("Constructor");
  }

  public static void main(String[] args) {
    // this will print
    // Ready
    // 0
    // swimmy
    // 1
    // Constructor
    System.out.println("Ready");

    new Cuttlefish();
  }
}