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

  public static void main(String[] args) {
    explore();
  }
}
