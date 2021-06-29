package com.codurance.ocpstudyguide.accessmodifiers.pond.inland;

import com.codurance.ocpstudyguide.accessmodifiers.pond.shore.Bird;

public class BirdWatcherFromAfar {
  public void watchBird() {
    Bird bird = new Bird();


    // Protected allows access to subclasses
    // in the same package
    // This will not compile as it is in a different package
//    bird.floatInWater();
//    System.out.println(bird.text());
  }
}
