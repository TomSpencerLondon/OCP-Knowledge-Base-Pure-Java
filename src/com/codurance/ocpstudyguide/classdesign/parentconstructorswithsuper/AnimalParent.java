package com.codurance.ocpstudyguide.classdesign.parentconstructorswithsuper;

public class AnimalParent {
  private int age;
  private String name;
  public AnimalParent(int age, String name){
    super();
    this.age = age;
    this.name = name;
  }

  public AnimalParent(int age) {
    super();
    this.age = age;
    this.name = null;
  }
}
