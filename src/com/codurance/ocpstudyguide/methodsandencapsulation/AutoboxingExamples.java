package com.codurance.ocpstudyguide.methodsandencapsulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AutoboxingExamples {
  public static void main(String[] args) {
    final Set set = new HashSet();

    for (int i = 0; i < 5; i++){
      set.add(i);
    }

    System.out.println(set.toString());


    final List list = new ArrayList();

    for (int i = 0; i < 5; i++) {
      list.add(i);
    }

    System.out.println(list.toString());

    char s = 'h';

    Character t = 't';

    String h = "hello";
  }
}
