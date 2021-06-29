package com.codurance.ocpstudyguide.accessmodifiers.duck;

public class FatherDuck {
  private String noise = "quack";

  private void quack() {
    System.out.println(noise);
  }

  private void makeNoise() {
    quack();
  }
}
