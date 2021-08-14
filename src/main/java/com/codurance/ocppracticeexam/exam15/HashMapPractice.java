package com.codurance.ocppracticeexam.exam15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {
  public static void main(String[] args) {

//    Map<String, List<String>> stateCitiesMap = new HashMap<>();

    Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>();

    List<String> cities = new ArrayList<>();
    cities.add("New York");
    cities.add("Albany");
    stateCitiesMap.put("NY", cities);

//    Select 2 options
//    A. Map<String, ArrayList<String>> stateCitiesMap = new HashMap<>();
//    B. Map<String, List<String>> stateCitiesMap = new HashMap<String, List<>>();
//    C. Map<String, ArrayList<String>> stateCitiesMap = new HashMap<<>, List<>>();
//    D. Map<String, List<String>> stateCitiesMap = new HashMap<String, ArrayList<String>>();
//    E. Map<String, List<String>> stateCitiesMap = new HashMap<>();
//    F. Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>();

  }
}
