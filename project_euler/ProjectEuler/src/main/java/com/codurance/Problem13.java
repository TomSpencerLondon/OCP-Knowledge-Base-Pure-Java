package com.codurance;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Problem13 {

  private final List<String> input;

  public Problem13(List<String> input) {
    this.input = input;
  }

  public String sum() {
    BigInteger sum = BigInteger.ZERO;
    for (String num : input) {
      sum = sum.add(new BigInteger(num));
    }

    return sum.toString().substring(0, 10);
  }
}
