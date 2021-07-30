package com.codurance.staticClass;

public class StaticClass {
  public static void someMethod() {
    System.out.println("This is some method!");
  }

  static void anotherMethod() {
    System.out.println("Another method!");
  }

  protected static void otherMethod() {
    System.out.println("Other method");

    // Anonymous class

    new Runnable() {
      @Override
      public void run() {
        System.out.println("It runs");
      }
    };
  }

  // Illegal combination of modifiers: 'abstract' and 'static'
  // abstract is only relevant to polymorphism
  // polymorphism does not work with static methods
  // static methods do not have instances
//  public abstract static void anotherOtherMethod() {
//    System.out.println("");
//  }

  public static void main(String[] args) {
    StaticClass.someMethod();
    StaticClass.anotherMethod();
    StaticClass.otherMethod();
  }
}
