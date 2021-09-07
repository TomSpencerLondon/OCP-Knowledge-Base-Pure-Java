package com.codurance.ocppracticeexam.exam2;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {
  public static void main(String[] args) {
    var nameList = new ArrayList<String>();
    nameList.add("Ally");
    nameList.add("Billy");
    nameList.add("Cally");
    nameList.add("Billy");
    nameList.add("Ally");

    var nameSet1 = new HashSet<String>();
    for (var name : nameList) nameSet1.add(name);
    var nameSet2 = new HashSet<String>(nameList);
    System.out.println(nameList.size()+ " " + nameSet1.size() + " " + nameSet2.size());
  }
}
