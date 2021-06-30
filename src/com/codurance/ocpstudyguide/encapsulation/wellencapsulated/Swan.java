package com.codurance.ocpstudyguide.encapsulation.wellencapsulated;

public class Swan {
  private int numEggs;
  public void layEgg() {
    numEggs++;
  }

  public void printEggCount() {
    System.out.println(numEggs);
  }
}
