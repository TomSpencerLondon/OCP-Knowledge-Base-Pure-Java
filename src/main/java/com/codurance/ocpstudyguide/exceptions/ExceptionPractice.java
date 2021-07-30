package com.codurance.ocpstudyguide.exceptions;

import java.io.IOException;

public class ExceptionPractice {

  static void explore() {
    try {
      fall(10);
    } catch (IOException e) {
      standUp();
    }
    seeAnimals();
  }

  static void standUp(){
    System.out.println("standing up");
  }

  static void fall(int distance) throws IOException {
    if (distance > 10) {
      throw new IOException();
    }
  }

  static void seeAnimals() {
    System.out.println("Wow!");
  }

  void fallWithTryCatch(int distance) {
    try {
      if (distance > 10) {
        throw new IOException();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String exceptions() {
    StringBuilder result = new StringBuilder();
    String v = null;
    try {
      try {
        result.append("before_");
        v.length();
        result.append("after_");
      } catch (NullPointerException e) {
        result.append("catch_");
        throw new RuntimeException();
      } finally {
        result.append("finally_");
        throw new Exception();
      }
    } catch (Exception e) {
      result.append("done");
    }

    return result.toString();
  }

  public static void main(String[] args) {
    explore();

    System.out.println(exceptions());
  }
}
