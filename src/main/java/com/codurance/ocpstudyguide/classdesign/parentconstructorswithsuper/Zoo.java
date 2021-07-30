package com.codurance.ocpstudyguide.classdesign.parentconstructorswithsuper;

public class Zoo {
//  public Zoo() {
//    System.out.println("Zoo created");
//    super(); // does not compile not first call
//  }


  public Zoo() {
    super();
    System.out.println("Zoo created");
    // super does not compile
//    super();
  }
}
