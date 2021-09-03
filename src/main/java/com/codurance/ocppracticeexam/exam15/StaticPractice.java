package com.codurance.ocppracticeexam.exam15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticPractice {
  int a;
  static int b;
  int f() { return a; }
  static int g() { return b; };

  public static void main(String[] args) {
//    Map<String, ArrayList<String>> stateCitiesMap1 = new HashMap<>();
//    Map<String, List<String>> stateCitiesMap = new HashMap<String, List<>>();
//    Map<String , ArrayList<String>> stateCitiesMap = new HashMap<<>, List<>>();
//    Map<String, List<String>> stateCitiesMap = new HashMap<String, ArrayList<String>>();
//    Map<String, List<String>> stateCitiesMap = new HashMap<>()
    Map<String, List<String>> stateCitiesMap1 = new HashMap<String, List<String>>();

    List<String> cities = new ArrayList<>();
    stateCitiesMap1.put("NY", cities);
    Map<String, List<String>> stateCitiesMap2 = new HashMap<>();
    stateCitiesMap2.put("NY", cities);
  }
}
