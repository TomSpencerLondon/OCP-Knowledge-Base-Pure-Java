package com.codurance.ocppracticeexam;

import java.util.List;

public class CopyPractice {
  public static void main(String[] args) {
    var numA = new Integer[]{1, 2};
    var list1 = List.of(numA);
    numA[0] = 2;
    var list2 = List.copyOf(list1);
    System.out.println(list1 + " " + list2);
  }
}
