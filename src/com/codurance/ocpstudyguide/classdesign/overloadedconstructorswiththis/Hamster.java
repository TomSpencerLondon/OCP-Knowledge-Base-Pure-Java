package com.codurance.ocpstudyguide.classdesign.overloadedconstructorswiththis;

public class Hamster {
  private String color;
  private int weight;
  public Hamster(int weight) {
    // Doesn't compile
//    Hamster(weight, "brown");
//
    // This creates a new object - not what we want
//    new Hamster(weight, "brown"); // compiles but incorrect

    // must be first call in the constructor
//    System.out.println("in the constructor"); // wouldn't work
    this(weight, "brown");


  }

  public Hamster(int weight, String color) {
    this.weight = weight;
    this.color = color;
  }
}
