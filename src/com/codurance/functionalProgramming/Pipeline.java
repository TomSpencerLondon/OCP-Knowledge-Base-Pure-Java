package com.codurance.functionalProgramming;

import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.stream.*;

public class Pipeline {
  public static void main(String[] args) {
    var list = List.of("Toby", "Anna", "Leroy", "Alex");
    list.stream().filter(n -> n.length() == 4).sorted()
        .limit(2)
        .forEach(System.out::println);


    Stream.generate(() -> "Elsa")
        .filter(n -> n.length() == 4)
        .limit(2)
        .sorted()
        .forEach(System.out::println);

    List<String> helper = Stream.of("goldfish", "finch")
        .filter(s -> s.length() > 5)
        .collect(Collectors.toList());

    long count = helper.stream()
        .count();

    System.out.println(count);

    Stream<Integer> stream = Stream.of(1, 2, 3);
    System.out.println(stream.reduce(0, (s, n) -> s + n));

    Stream<Integer> stream2 = Stream.of(1, 2, 3);

    System.out.println(stream2.mapToInt(x -> x).sum()); // 6

    var integerList = new ArrayList<>();

    Stream<String> objStream = Stream.of("penguin", "fish");

    IntStream intStream = objStream.mapToInt(s -> s.length());

    ArrayList<Integer> integerList2 = new ArrayList<>();

    IntStream stream1 = integerList2.stream()
        .flatMapToInt(x -> IntStream.of(x));

    DoubleStream doubles = integerList2.stream()
        .flatMapToDouble(x -> DoubleStream.of(x));

    LongStream longs = integerList2.stream()
        .flatMapToLong(x -> LongStream.of(x));


    IntStream stream3 = IntStream.rangeClosed(1, 10);

    OptionalDouble average = stream3.average();

    average.ifPresent(System.out::println);
    System.out.println(average.getAsDouble());

    System.out.println(average.orElseGet(() -> Double.NaN));

    IntStream stream4 = IntStream.rangeClosed(1, 10);
    OptionalDouble optional1 = stream4.average();

    optional1.ifPresent(System.out::println);
    System.out.println(optional1.getAsDouble());
    System.out.println(optional1.orElseGet(() -> Double.NaN));

    BooleanSupplier b1 = () -> true;
    BooleanSupplier b2 = () -> Math.random() > .5;
    System.out.println(b1.getAsBoolean()); // true
    System.out.println(b2.getAsBoolean()); // false

    var cats = new ArrayList<String>();
    cats.add("Annie");
    cats.add("Ripley");

    var stream12 = cats.stream();
    cats.add("KC");

    System.out.println(stream12.count());
  }


  private static void threeDigit(Optional<Integer> optional) {
//    if (optional.isPresent()) {
//      var num = optional.get();
//      var string = "" + num;
//      if (string.length() == 3)
//        System.out.println(string);
//    }

    optional.map(n -> "" + n)
        .filter(s -> s.length() == 3)
        .ifPresent(System.out::println);
  }


  private static int max(IntStream ints) {
    OptionalInt option = ints.max();
    return option.orElseThrow(RuntimeException::new);
  }

  private static int range(IntStream ints) {
    IntSummaryStatistics stats = ints.summaryStatistics();
    if (stats.getCount() == 0) throw new RuntimeException();
    return stats.getMax()-stats.getMin();
  }



  private static Stream<Integer> mapping(IntStream stream) {
    return stream.mapToObj(x -> x);
  }

  private static Stream<Integer> boxing(IntStream stream) {
    return stream.boxed();
  }
}
