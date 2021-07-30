package com.codurance.ocpstudyguide.accessmodifiers.pond.swan;

import com.codurance.ocpstudyguide.accessmodifiers.duck.MotherDuck;

public class BadCygnet {
  public void makeNoise() {
    MotherDuck duck = new MotherDuck();

    // doesn't compile as using package private functions
//    duck.quack();
//    System.out.println(duck.noise);
  }
}
