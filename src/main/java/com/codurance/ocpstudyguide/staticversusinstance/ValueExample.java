package com.codurance.ocpstudyguide.staticversusinstance;

public class ValueExample {
  public static void main(String[] args) {
    StringBuilder name = new StringBuilder();
    speak(name);
    System.out.println(name);
  }

  public static void speak(StringBuilder s) {
    s.append("Webby");
  }
}
