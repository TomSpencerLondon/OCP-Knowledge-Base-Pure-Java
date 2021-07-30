package com.codurance.stringpractice;

import com.codurance.interfaces.FieldsInInterfaces;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Locale;

public class StringPractice {
  public static void main(String[] args) {
    "hello".intern();

//    Hashtable<String, String> table = new Hashtable<String, String>();
    HashMap map = new LinkedHashMap<Integer, String>();

    map.put(2, "two");
    map.put(3, "three");
    map.put(1, "one");

    System.out.println(map.toString());

    final int i = FieldsInInterfaces.i;
    new SimpleInterface() { };
  }

  private class C { }
}

interface SimpleInterface {};
interface ComplexInterface {};