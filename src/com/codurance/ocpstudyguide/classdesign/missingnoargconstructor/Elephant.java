package com.codurance.ocpstudyguide.classdesign.missingnoargconstructor;

public class Elephant extends Mammal { // does not compile
  // compiles with call to parent class
  public Elephant() {
    super(10);
  }
}
