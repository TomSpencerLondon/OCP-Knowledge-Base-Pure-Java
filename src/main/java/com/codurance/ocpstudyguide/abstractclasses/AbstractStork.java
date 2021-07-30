package com.codurance.ocpstudyguide.abstractclasses;


abstract class AbstractBird {
  public abstract String getName();
  public void printName() {
    System.out.println(getName());
  }
}

public class AbstractStork extends AbstractBird  {

  public String getName() {
    return "Abstract Stork!";
  }

  public static void main(String[] args) {
    new AbstractStork().printName();
  }
}
