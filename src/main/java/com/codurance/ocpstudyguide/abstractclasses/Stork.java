package com.codurance.ocpstudyguide.abstractclasses;

class NormalBird {
  public String getName() { return null; }
  public void printName() {
    System.out.println(getName());
  }
}

public class Stork extends NormalBird {
  public String getName() { return "Stork!"; }
  public static void main(String[] args) {
    new Stork().printName();
  }
}
