package com.codurance.collections;

import java.util.*;

public class CollectionsPractice {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    List<String> months = List.of("feb", "jan", "july");

    SortedSet<String> x = new TreeSet<String>();
    x.add("o");
    x.add("a");
    x.add("z");
    System.out.println(x);
  }
}
