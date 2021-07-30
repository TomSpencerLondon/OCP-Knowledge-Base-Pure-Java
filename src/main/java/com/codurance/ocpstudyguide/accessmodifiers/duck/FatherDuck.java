package com.codurance.ocpstudyguide.accessmodifiers.duck;

public class FatherDuck {
  private String noise = "quack";

  void fatherQuack() {
  }

  private void quack() {
    System.out.println(noise);
  }

  private void makeNoise() {
    quack();
  }
}
