package com.codurance.tryPractice;

public class TryPractice {
  public static void main(String[] args) {
    try{
      var x = 1 / 0;
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
