package com.codurance.functionalInterfaces;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
  public abstract void hello();

  public static void goodbye() {
    throw new UnsupportedOperationException("Implement me!");
  }

  default void go() {
    throw new UnsupportedOperationException("Implement me!");
  }
}
