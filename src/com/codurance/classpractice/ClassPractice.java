package com.codurance.classpractice;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

public class ClassPractice {
  static class Hello {
    final String hello = "Hello";
  }

}

class Check {
  public static void main(String[] args) {
    final ClassPractice.Hello hello = new ClassPractice.Hello();

  }

  private static Greeting greeting = new Greeting() {
    @Override
    public void greet() {

    }
  };
}

interface Greeting {
  void greet();
}