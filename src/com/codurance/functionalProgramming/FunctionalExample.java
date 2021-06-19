package com.codurance.functionalProgramming;

import com.codurance.functionalInterfaces.FunctionalInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalExample {
  public static void main(String[] args) {
    Supplier<LocalDate> s1 = LocalDate::now;
    Supplier<LocalDate> s2 = () -> LocalDate.now();

    LocalDate d1 = s1.get();
    LocalDate d2 = s2.get();

    System.out.println(d1);
    System.out.println(d2);

    Supplier<StringBuilder> s3 = StringBuilder::new;
    Supplier<StringBuilder> s4 = () -> new StringBuilder();

    System.out.println(s3.get());
    System.out.println(s4.get());

    Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
    ArrayList<String> a1 = s5.get();

    System.out.println(a1);

    Consumer<String> c1 = System.out::println;
    Consumer<String> c2 = x -> System.out.println(x);

    c1.accept("Annie");
    c2.accept("Annie");

    var map = new HashMap<String, String>();
    BiConsumer<String, String> b1 = map::put;
    BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);

    b1.accept("chicken", "Cluck");
    b2.accept("chick", "Tweep");
    System.out.println(map);
  }
}
