package com.codurance.ocpstudyguide.accessmodifiers.pond.swan;

import com.codurance.ocpstudyguide.accessmodifiers.pond.shore.Bird;

public class Swan extends Bird {
  public void swim() {
    floatInWater();
    System.out.println(text);
  }

  public void helpOtherSwanSwim() {
    Swan other = new Swan();
    other.floatInWater();
    System.out.println(other.text);
  }

  public void helpOtherBirdSwim() {
//    'floatInWater()' has protected access in
//    'com.codurance.ocpstudyguide.accessmodifiers.pond.shore.Bird'
    // Here Bird reference is used from a different package
    Bird other = new Bird();
//    other.floatInWater();
//    System.out.println(other.text);
  }
}
