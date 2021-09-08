package com.codurance;

public class Problem9 {
  public String findPythagoreanTripletProductFor(int number) {

    for (int a = 1; a < number; a++){
      for (int b = a + 1; b < number; b++){
        int c = number - a - b;
        if (a * a + b * b == c * c){
          return Integer.toString(a * b * c);
        }
      }
    }
    throw new AssertionError("Not found");
  }
}
