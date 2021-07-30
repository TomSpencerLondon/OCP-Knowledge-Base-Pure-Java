package com.codurance.ocpstudyguide.accessmodifiers.duck;

public class NewDuckling extends FatherDuck {

  // public
  // protected - visible in subclasses in other packages
  // no modifier (package protected)
  // private

  @Override
  protected void fatherQuack() {
    super.fatherQuack();
  }
}
