package com.codurance.ocppracticeexam.exam3;

import java.util.ArrayList;
import java.util.List;

public class ListTypes {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    doElements(list);
  }

  static void doElements(List l){
    l.add("string");
    System.out.println(l.get(0));
  }
}
