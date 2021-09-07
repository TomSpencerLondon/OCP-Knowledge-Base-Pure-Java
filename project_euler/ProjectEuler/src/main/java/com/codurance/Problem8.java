package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {
  private final String longNumber;

  public Problem8(String longNumber) {
    this.longNumber = longNumber;
  }

  public long findLargestProductFor(int numberOfDigits) {
    final List<String> split = List.of(longNumber.split(""));
    long product = 0;

    for (int i = 0; i < split.size()- numberOfDigits; i++) {
      long temp = 1;

      for (int j = 0; j < numberOfDigits; j++) {
        temp *= Integer.parseInt(split.get(i + j));
      }

      if (temp > product) {
        product = temp;
      }
    }

    return product;
  }
}
