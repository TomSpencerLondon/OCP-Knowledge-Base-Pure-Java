package com.codurance.ocppracticeexam.exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Args {
  static Map<String, List<Double>> groupedValues = new HashMap<>();

  public static void main(String[] args) {
    process("tom",  5.0);
    process("dmitri", 10.0);
    process("tom", 7.0);
    process("harry", 0.1);
    System.out.println(groupedValues);
  }

  public static void process(String name, Double value){
    groupedValues.computeIfAbsent(name, (a)->new ArrayList<Double>())
        .add(value);
  }
}
