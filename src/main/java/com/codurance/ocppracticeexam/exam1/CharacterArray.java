package com.codurance.ocppracticeexam.exam1;

import java.util.Arrays;
import java.util.List;

public class CharacterArray {
  public static void main(String[] args) {
    List<Character> ratings = Arrays.asList('U', 'R', 'A');
    ratings.stream()
        .filter(x -> x == 'A')
        .peek(x -> System.out.println("Old rating " + x)) // 2
        .map(x -> x == 'A' ? 'R' : x)
        .forEach(x -> System.out.println("New Rating " + x));
  }
}
