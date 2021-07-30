package com.codurance.ocpstudyguide.functionalinterfaces;

import com.codurance.ocpstudyguide.lambdas.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("fish", false, true));

    print(animals, a -> a.canHop());

    Consumer<String> consumer = x -> System.out.println(x);

    print(consumer, "Hello World");


    Supplier<Integer> number = () -> 42;

    Supplier<Integer> random = () -> new Random().nextInt();

    System.out.println(returnNumber(number));

  }

  private static int returnNumber(Supplier<Integer> supplier){
    return supplier.get();
  }

  private static void print(Consumer<String> consumer, String value){
    consumer.accept(value);
  }

  private static void print(List<Animal> animals, Predicate<Animal> checker){
    for (Animal animal : animals){
      if (checker.test(animal)){
        System.out.println(animal + " ");
      }
    }

    System.out.println();
  }
}
