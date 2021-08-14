package com.codurance.ocppracticeexam.exam15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayTypes {

  public static void main(String[] args) {

    String[] names = {"Alex", "Bob", "Charlie"};
//    List<?> list = new ArrayList<>(Arrays.asList(names));
    List<String> list = new ArrayList<>(Arrays.asList(names));
    System.out.println(list.get(0));

  }
}
