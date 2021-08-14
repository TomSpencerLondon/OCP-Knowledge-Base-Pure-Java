package com.codurance.ocppracticeexam.exam15;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
  public static void main(String[] args) {
    Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
    Stream<String> firstNames = names.map(e -> e.split(" ")[0]);

    System.out.println(firstNames.collect(Collectors.toList()));

    // INSERT CODE HERE

//    names.map(e -> e.split(" ")[0]);
//    names.reduce(e -> e.split(" ")[0]);
//    names.filter(e -> e.split(" ")[0]);
//    names.forEach(e -> e.split(" ")[0]);

  }
}
