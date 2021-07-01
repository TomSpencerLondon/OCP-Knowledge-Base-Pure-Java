package com.codurance.ocpstudyguide.locale;

import java.util.Locale;
import java.util.function.Predicate;

public class LocalePractice {
  public static void main(String[] args) {
    Locale.CANADA.getCountry();

    final Locale locale = new Locale("fr", "CA");

    System.out.println(locale.toString());
  }
}
