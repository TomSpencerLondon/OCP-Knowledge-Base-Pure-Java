package com.codurance.ocpstudyguide.classdesign.parentconstructorswithsuper;

public class GorillaChild extends AnimalParent {
  public GorillaChild(){
    super(5);
  }

  public GorillaChild(int age) {
    super(age);
  }
}
