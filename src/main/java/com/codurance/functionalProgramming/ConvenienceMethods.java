package com.codurance.functionalProgramming;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethods {


  public static void main(String[] args) {
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");

    Predicate<String> brownEggs = egg.and(brown);
    Predicate<String> otherEggs = egg.and(brown.negate());

    Consumer<String> c1 = x -> System.out.print("1: " + x);
    Consumer<String> c2 = x -> System.out.println(" ,2: " + x);

    Consumer<String> combined = c1.andThen(c2);
    combined.accept("Annie");

    Optional<Double> opt = average(90, 100);

    if (opt.isPresent())
      System.out.println(opt.get()); // 95.0

    Function<Integer, Integer> before = x -> x + 1;
    Function<Integer, Integer> after = x -> x * 2;

    Function<Integer, Integer> combined2 = after.compose(before);


    System.out.println(combined2.apply(3));
  }


  public static Optional<Double> average(int... scores){
    if (scores.length == 0) return Optional.empty();
    int sum = 0;

    for (int score : scores) sum += score;

    return Optional.of((double) sum / scores.length);
  }
}
