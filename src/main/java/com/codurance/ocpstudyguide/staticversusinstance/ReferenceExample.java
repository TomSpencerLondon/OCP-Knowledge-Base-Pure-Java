package com.codurance.ocpstudyguide.staticversusinstance;

public class ReferenceExample {
  public static void main(String[] args) {
    String name = "Webby";
    speak(name);
    System.out.println(name);
  }

  public static void speak(String name) {
    name = "Sparky";
  }
}
