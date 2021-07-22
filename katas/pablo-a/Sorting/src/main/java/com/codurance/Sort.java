package com.codurance;

import java.util.Arrays;

public class Sort {
  public int[] sort(int... numbers) {

    int aux = 0;
    int[] result = numbers;
    for (int j = 0; j < result.length; j++) {
      for (int i = 1; i < numbers.length; i++) {
        if (result[i] < result[i - 1]) {
          aux = result[i];
          result[i] = result[i - 1];
          result[i - 1] = aux;
        }
      }
    }
    return result;
  }
}
