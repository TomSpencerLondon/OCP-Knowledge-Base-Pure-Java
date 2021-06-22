package com.codurance.functionalInterfaces;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
  public abstract void hello();

  public static void goodbye() {
    System.out.println("goodbye!");
  }

  default void go() {
    System.out.println("Let's go!");
  }
}

class Greeting {
  public static void main(String[] args) {
    FunctionalInterface.goodbye();
  }
}
