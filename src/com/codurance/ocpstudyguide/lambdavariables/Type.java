package com.codurance.ocpstudyguide.lambdavariables;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Type {
  public static void main(String[] args) {

  }

  public void whatAmi() {
    consume((var x) -> System.out.println(x), 123);
  }

  public void consume(Consumer<Integer> c, int num) {
    c.accept(num);
  }

  public void counts(List<Integer> list){
    list.sort((var x, var y) -> x.compareTo(y));
  }
//
//  public void variables(int a) {
//    int b = 1;
//    Predicate<Integer> p1 = a -> {
//      int b = 0;
//      int c = 0;
//      return b == c;
//    };
//  }
}
