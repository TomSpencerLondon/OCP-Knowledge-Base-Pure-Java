package com.codurance.ocppracticeexam.exam15;

import java.util.Arrays;
import java.util.List;

public class ListOfPractice {
  public static void main(String[] args) {
    var numA = new Integer[]{1, 2};
    var list1 = Arrays.asList(numA);
    numA[0] = 2;
    var list2 = List.copyOf(list1);
    System.out.println(list1 + " " + list2);
  }
}
