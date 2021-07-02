package com.codurance.ocpstudyguide.classdesign.overloadversusoverriding;

public class Rider {
  public static void main(String[] args) {
    final Camel bactrianCamel = new BactrianCamel();
    System.out.println(bactrianCamel.getNumberOfHumps());
  }
}
