package com.codurance.ocpstudyguide.classdesign.genericreturntypes;

import java.util.ArrayList;
import java.util.List;

public class Mammal {
  public List<CharSequence> play() {
    return new ArrayList<>();
  }

  public CharSequence sleep() {
    CharSequence charSequence = new StringBuffer("baeldung");
    System.out.println(charSequence.toString());
    return charSequence;
  }

  public static void main(String[] args) {
    final Mammal mammal = new Mammal();
    mammal.sleep();
  }

}
