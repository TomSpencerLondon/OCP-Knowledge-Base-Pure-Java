package com.codurance.MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
  private final Map<Object, Object> map;

  public MapPractice() {
    map = new HashMap<>();
  }

  public static void main(String[] args) {
    Map<String, String> hashMap = new HashMap<>();

    hashMap.put("British-Greeting", "Hello");
    boolean b = hashMap.containsKey("British-Greeting");
    Set<Map.Entry<String, String>> entries = hashMap.entrySet();

    System.out.println(entries);

//    hashMap.forEach((e) -> e);

    hashMap.containsValue("Hello");
    hashMap.remove("British-Greeting");
    hashMap.containsKey("British-Greeting");
    hashMap.put("American-Greeting", "Howdi!");
    hashMap.put("Polish-Greeting", "cześć!");

    Collection<String> values = hashMap.values();
    values.forEach((v) -> System.out.println(v));
  }
}
