package com.codurance.interfaces;

public class InterfacePractice extends Hello implements SecondInterface {
}

class Hello {

}

interface A extends Runnable {
}

class B extends Hello implements A {
  @Override
  public void run() {
  }
}

interface C {
  public abstract void abc();
  default void def(){};

}