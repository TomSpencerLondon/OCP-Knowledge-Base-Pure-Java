package com.codurance.effectiveJava.item2.builderClassHierarchies;

import static com.codurance.effectiveJava.item2.builderClassHierarchies.NYPizza.Size.SMALL;
import static com.codurance.effectiveJava.item2.builderClassHierarchies.Pizza.Topping.HAM;
import static com.codurance.effectiveJava.item2.builderClassHierarchies.Pizza.Topping.ONION;
import static com.codurance.effectiveJava.item2.builderClassHierarchies.Pizza.Topping.SAUSAGE;

import com.codurance.effectiveJava.item2.builderClassHierarchies.Calzone.Builder;
import com.codurance.effectiveJava.item2.builderClassHierarchies.Pizza.Topping;

public class Client {

  public static void main(String[] args) {
    Pizza nyPizza = new NYPizza.Builder(SMALL)
        .addTopping(SAUSAGE)
        .addTopping(ONION)
        .build();


    System.out.println(nyPizza.toString());

    Calzone calzone = new Builder()
        .addTopping(HAM)
        .sauceInside().build();

    System.out.println(calzone.toString());

  }
}
