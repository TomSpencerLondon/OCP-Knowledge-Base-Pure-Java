package com.codurance.ocppracticeexam.exam15;

public class ComparablePractice {
  public static void main(String[] args) {
    var cin = new Comparable<Integer>() {
      public int compareTo(Integer i1) {
        return "100".compareTo("" + i1);
      }
    };
  }
}
