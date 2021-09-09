package com.codurance.ocppracticeexam.exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
  public static void main(String[] args) {
    List<String> vowels = new ArrayList<String>();
    vowels.add("a");
    vowels.add("e");
    vowels.add("i");
    vowels.add("o");
    vowels.add("u");

    Function<List<String>, List<String>> f = list -> list.subList(2, 4);
    final List<String> newList = f.apply(vowels);
    newList.forEach(System.out::print);
  }
}
