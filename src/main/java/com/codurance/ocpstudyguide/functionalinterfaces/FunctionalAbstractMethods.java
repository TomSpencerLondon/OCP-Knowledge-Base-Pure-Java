package com.codurance.ocpstudyguide.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalAbstractMethods {

  public static void main(String[] args) {
    // all methods in an interface
    // are abstract by default.

    // example Predicate for square root check
    Predicate<Integer> square = n ->
        Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0;

    final List<Integer> squares = List.of(4, 9, 17)
        .stream()
        .filter(e -> square.test(e))
        .collect(Collectors.toList());

    System.out.println(squares.toString());
  }
}
