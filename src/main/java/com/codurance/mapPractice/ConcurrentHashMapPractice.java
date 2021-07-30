package com.codurance.mapPractice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// One thread add to the map
// guaranteed that we can safely get
// an object from the map
public class ConcurrentHashMapPractice {
  public static void main(String[] args) {
    Map<String, String> hashMap = new ConcurrentHashMap<>();

    hashMap.put("British-Greeting", "Hello");
    boolean b = hashMap.containsKey("British-Greeting");
    Set<Map.Entry<String, String>> entries = hashMap.entrySet();

    System.out.println(entries);

    hashMap.forEach((k, v) -> {
      System.out.print(k + " | ");
      System.out.println(v);
    });

    hashMap.containsValue("Hello");
    hashMap.remove("British-Greeting");
    hashMap.containsKey("British-Greeting");
    hashMap.put("American-Greeting", "Howdi!");
    hashMap.put("Polish-Greeting", "cześć!");

    Collection<String> values = hashMap.values();
    values.forEach((v) -> System.out.println(v));
  }
}
