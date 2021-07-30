package com.codurance.functionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamsPractice {
  public static void main(String[] args) {
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleElement = Stream.of(1);

    Stream<Integer> fromArray = Stream.of(1, 2, 3);

    var list = List.of("a", "b", "c");

    Stream<String> fromList = list.stream();

    List<String> stringList = List.of("a", "b", "c");

    Stream<String> fromListParallel = stringList.parallelStream();

    Stream<Double> randoms = Stream.generate(Math::random).limit(5);

    Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2).limit(10);

    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

    System.out.println(s.count());

    Stream<String> monkeys = Stream.of("monkey", "ape", "bonobo");
    Optional<String> min = monkeys.min((s1, s2) -> s1.length() - s2.length());
    min.ifPresent(System.out::println);

    Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);

    System.out.println(minEmpty.isPresent());

    Stream<String> m = Stream.of("monkey", "gorilla", "bonobo");
    Stream<String> infinite = Stream.generate(() -> "chimp");

    m.findAny().ifPresent(System.out::println);
    infinite.findAny().ifPresent(System.out::println);

    List<String> list3 = List.of("monkey", "2", "chimp");

    Stream<String> infiniteMonkeys = Stream.generate(() -> "chimp");
    Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

    System.out.println(list3.stream().anyMatch(pred));

    System.out.println(list3.stream().allMatch(pred));
    System.out.println(list3.stream().noneMatch(pred));
    System.out.println(infiniteMonkeys.anyMatch(pred));

    Stream<String> ms = Stream.of("Monkey", "Gorilla", "Bonobo");
    ms.forEach(System.out::println);

    String[] array = {"w", "o", "l", "f"};
    var result = "";

    for (var t : array) result = result + t;
    System.out.println(result);

    Stream<String> str = Stream.of("w", "o", "l", "f");

    String word = str.reduce("", String::concat);

    System.out.println(word);


    Stream<Integer> streaming = Stream.of(3, 5, 6);
    System.out.println(streaming.reduce(1, (a, b) -> a * b));

    BinaryOperator<Integer> op = (a, b) -> a * b;

    Stream<Object> empty1 = Stream.empty();

    Stream<Integer> oneElement = Stream.of(3);

    Stream<Integer> threeElements = Stream.of(3, 5, 6);

    Stream<String> monkeyStream = Stream.of("monkey", "gorilla", "bonobo");

    monkeyStream.filter(x -> x.startsWith("m"))
        .forEach(System.out::println);

    Stream<String> ds = Stream.of("duck", "duck", "duck", "goose");
    ds.distinct()
        .forEach(System.out::println);


    Stream<String> monkeyLengths = Stream.of("monkey", "gorilla", "bonobo");
    monkeyLengths.map(String::length)
        .forEach(System.out::println);

    List<String> zero = List.of();
  }
}
