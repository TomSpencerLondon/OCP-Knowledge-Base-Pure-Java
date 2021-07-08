package com.codurance.designPatterns.templatemethodpattern;

public class Developer {
  public static void main(String[] args) {
    // https://www.baeldung.com/java-template-method-pattern
    new StandardComputerBuilder()
        .buildComputer()
        .getComputerParts()
        .forEach((k, v) -> System.out.println("Part: " + k + " Value : " + v));

    /*
    public boolean addAll(int index, Collection<? extends E> c) {
       rangeCheckForAdd(index);
       boolean modified = false;
       for (E e : c) {
          add(index++, e);
          modified = true;
       }
       return modified;
    }
     */
  }
}
