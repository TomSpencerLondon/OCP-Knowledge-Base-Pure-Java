package com.codurance.ocpstudyguide.accessmodifiers.pond.goose;

import com.codurance.ocpstudyguide.accessmodifiers.pond.duck.DuckTeacher;

public class LostDuckling {
  public void swim() {
    DuckTeacher teacher = new DuckTeacher();
    teacher.swim();
    System.out.println("Thanks " + teacher.name);
  }
}
