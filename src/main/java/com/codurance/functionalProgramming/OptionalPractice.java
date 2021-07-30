package com.codurance.functionalProgramming;

import java.util.Optional;

public class OptionalPractice {
  public static Optional<Double> average(int... scores) {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;

    for (int score : scores) sum += score;

    return Optional.of((double) sum / scores.length);
  }

  public static void main(String[] args) {
    System.out.println(average(90, 100));
    System.out.println(average());

    Optional<Double> opt = average(90, 100);
    if (opt.isPresent())
      System.out.println(opt.get()); // 95.0

    Optional<Double> opt2 = average(90, 100);

    opt.ifPresent(System.out::println);

    Optional<Double> opt3 = average();

    System.out.println(opt3.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));

    Optional<Double> opt4 = average();

    System.out.println(opt4.orElseThrow());
//
//    Optional<Double> opt5 = average();
//    System.out.println(opt5.orElseThrow(() -> new IllegalStateException()));

    Optional<Double> opt7 = average(90, 100);
    System.out.println(opt7.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
//    System.out.println(opt7.orElseThrow());
  }
}
