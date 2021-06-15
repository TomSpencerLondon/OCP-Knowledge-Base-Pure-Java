package com.codurance.conditionals;

public class Conditional {

  public static void someMethod() {
    if (hello()){
      System.out.println("Hello");
    }

    boolean a = false;
    boolean b = true;

    if (a = b) {
      System.out.println("a = b");
    }

    if (false) ; else ;
    System.out.println("End of function");

//    No implicit transformation
//    if ("hello"){
//
//    }
  }

  private static boolean hello() {
    return true;
  }

  public static void main(String[] args) {
    someMethod();
  }
}
