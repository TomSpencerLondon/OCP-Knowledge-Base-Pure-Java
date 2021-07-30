package com.codurance.effectiveJava.item8;

// Ill-behaved client of resource with cleaner safety-net (page 33)
public class Teenager {
  public static void main(String[] args) {
    new Room(99);
    System.out.println("chill out, Man!");

    // don't depend on garbage collector
    // System.gc();
  }
}
