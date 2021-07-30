package com.codurance.exceptionhandling;

import java.util.Locale;

public class BadExceptionHandling {
  public static boolean makeVeryImportantDecision(int number) {
    try {
      var x = 10 / number;
      return true;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
//    I have made a good decision
/// by zero
//    I have made a good decision
    // Exception is swallowed by this code
    if (makeVeryImportantDecision(2)) {
      System.out.println("I have made a good decision");
    }

    if (makeVeryImportantDecision(0)) {
      System.out.println("I have made a good decision");
    }

  }
}
