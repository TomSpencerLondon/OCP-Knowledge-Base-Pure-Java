package com.codurance.functionalProgramming;

import java.util.List;
import java.util.function.*;

public class FunctionalInterfaceExample {
  @FunctionalInterface
  public interface Predicate<T> {
    boolean test(T t);
    // omitted default and static methods
  }

  @FunctionalInterface
  public interface BiPredicate<T, U> {
    boolean test(T t, U u);
    // omitted default methods
  }

  public static void main(String[] args) {
    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();

    System.out.println(p1.test(""));
    System.out.println(p2.test(""));

    BiPredicate<String, String> b1 = String::startsWith;
    BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

    System.out.println(b1.test("chicken", "chick"));
    System.out.println(b2.test("chicken", "chick"));

    Function<String, Integer> f1 = String::length;
    Function<String, Integer> f2 = x -> x.length();

    System.out.println(f1.apply("cluck"));
    System.out.println(f1.apply("cluck"));

    BiFunction<String, String, String> b3 = String::concat;

    BiFunction<String, String, String> b4 = (string, toAdd) -> string.concat(toAdd);

    System.out.println(b3.apply("baby ", "chick"));
    System.out.println(b4.apply("baby ", "chick"));

    UnaryOperator<String> u1 = String::toUpperCase;
    UnaryOperator<String> u2 = x -> x.toUpperCase();

    System.out.println(u1.apply("chirp"));
    System.out.println(u2.apply("chirp"));

    BinaryOperator<String> b5 = String::concat;
    BinaryOperator<String> b6 = (string, toAdd) -> string.concat(toAdd);

    System.out.println(b5.apply("baby ", "chick"));
    System.out.println(b6.apply("baby ", "chick"));

    Predicate<List> ex1 = x -> "".equals(x.get(0));
    Consumer<Long> ex2 = (Long l) -> System.out.println(l);
    BiPredicate<String, String> ex3 = (s1, s2) -> false;

    Function<List<String>, String> ex4 = x -> x.get(0);

    UnaryOperator<Long> ex5 = (Long l) -> Double.valueOf(3.14).longValue();

    Predicate<String> ex7 = String::isEmpty;
  }
}
