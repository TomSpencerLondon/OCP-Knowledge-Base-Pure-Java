package com.codurance.ocpstudyguide.staticversusinstance;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Reference2 {
  public static void print(Iterable i) {
    System.out.println("I");
  }

  public static void print(CharSequence c) {
    System.out.println("C");
  }

  public static void print(Object o) {
    System.out.println("O");
  }

  // This prints CIO
  // String and StringBuilder implement the
  // CharSequence interface
  // ArrayList implements the Iterable interface
  // LocalDate inherits from Object so the
  // Object signature reference is used
  public static void main(String[] args) {
    print("abc");
    print(new ArrayList<>());
    print(LocalDate.of(2019, Month.JULY, 4));
  }
}
