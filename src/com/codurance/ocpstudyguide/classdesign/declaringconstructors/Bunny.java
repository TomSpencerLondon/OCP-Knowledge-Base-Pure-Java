package com.codurance.ocpstudyguide.classdesign.declaringconstructors;

public class Bunny {
  public Bunny() {
    System.out.println("constructor");
  }

  // does not compile no return type makes it a constructor
  // Java is case sensitive
//  public bunny(){}

  // valid method void return but
//  public void Bunny() {}
}

// can't use var in initializer for constructor
//class Bonobo {
//  public Bonobo(var food) {
//
//  }
//}