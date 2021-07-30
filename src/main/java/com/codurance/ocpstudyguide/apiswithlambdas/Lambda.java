package com.codurance.ocpstudyguide.apiswithlambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Lambda {
  public static void main(String[] args) {
    ArrayList<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies);
    bunnies.removeIf(s -> s.charAt(0) != 'h');
    System.out.println(bunnies);

    ArrayList<String> bunnies2 = new ArrayList<>();
    bunnies2.add("long ear");
    bunnies2.add("floppy");
    bunnies2.add("hoppy");

    System.out.println(bunnies2);
    bunnies2.sort((b1, b2) -> b1.compareTo(b2));
    System.out.println(bunnies2);

    ArrayList<String> bunnies3 = new ArrayList<>();
    bunnies3.add("long ear");
    bunnies3.add("floppy");
    bunnies3.add("hoppy");

    bunnies3.forEach(b -> System.out.println(b));
    System.out.println(bunnies3);

    Set<String> bunniesSet = Set.of("long ear", "floppy", "hoppy");

    bunniesSet.forEach(b -> System.out.println(b));

    HashMap<String, Integer> bunniesMap = new HashMap<>();
    bunniesMap.put("long ear", 3);
    bunniesMap.put("floppy", 8);
    bunniesMap.put("hoppy", 1);

    bunniesMap.keySet().forEach(b -> System.out.println(b));
    bunniesMap.values().forEach(b -> System.out.println(b));


    HashMap<String, Integer> bunniesDirect = new HashMap<>();
    bunniesDirect.put("long ear", 3);
    bunniesDirect.put("floppy", 8);
    bunniesDirect.put("hoppy", 1);

    bunniesDirect.forEach((k, v) -> System.out.println(k + " " + v));
  }
}
