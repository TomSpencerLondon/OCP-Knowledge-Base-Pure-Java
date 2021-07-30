package com.codurance.functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CommonIntermediateOperations {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

    s.filter(x -> x.startsWith("m"))
        .forEach(System.out::println);

    Stream<String> duckGoose = Stream.of("duck", "duck", "duck", "goose");

    duckGoose.distinct()
        .forEach(System.out::println);

    Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);
    iterate.skip(5)
        .limit(2)
        .forEach(System.out::println);

    Stream<String> mapStream = Stream.of("monkey", "gorilla", "bonobo");
    mapStream.map(String::length)
        .forEach(System.out::println);

    List<String> zero = List.of();

    var one = List.of("Bonobo");
    var two = List.of("Mamo Gorilla", "Baby Gorilla");
    Stream<List<String>> animals = Stream.of(zero, one, two);

    animals.flatMap(m -> m.stream())
        .forEach(System.out::println);

    Stream<String> sorted = Stream.of("brown-", "bear-");
    sorted.sorted()
        .forEach(System.out::println);

    Stream<String> sort = Stream.of("brown bear-", "grizzly-");
    sort.sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

    var stream2 = Stream.of("black bear", "brown bear", "grizzly");
    long count = stream2.filter(e -> e.startsWith("g"))
        .peek(System.out::println).count();

    System.out.println(count);
  }
}
