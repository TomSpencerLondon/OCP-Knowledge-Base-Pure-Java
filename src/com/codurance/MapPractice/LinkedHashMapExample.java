package com.codurance.MapPractice;

import java.util.*;

// Keep an order of the items added to the map
// This implementation differs from HashMap in
// that it maintains a doubly-linked list running
// through all of its entries. This linked list
// defines the iteration ordering, which is
// normally the order in which keys were
// inserted into the map (insertion-order).
public class LinkedHashMapExample {

  public static final String BRITISH_GREETING = "British-Greeting";

  public static void main(String[] args) {
    Map<String, String> map = new LinkedHashMap<>();

    map.put(BRITISH_GREETING, "Hello");
    boolean b = map.containsKey(BRITISH_GREETING);
    Set<Map.Entry<String, String>> entries = map.entrySet();

    System.out.println(entries);

    map.forEach((k, v) -> {
      System.out.print(k + " | ");
      System.out.println(v);
    });

    map.containsValue("Hello");
    map.remove("British-Greeting");
    map.containsKey("British-Greeting");
    map.put("American-Greeting", "Howdi!");
    map.put("Polish-Greeting", "cześć!");

    Collection<String> values = map.values();
    values.forEach(System.out::println);
  }
}
