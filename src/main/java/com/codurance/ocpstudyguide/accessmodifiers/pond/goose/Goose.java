package com.codurance.ocpstudyguide.accessmodifiers.pond.goose;

import com.codurance.ocpstudyguide.accessmodifiers.pond.shore.Bird;

public class Goose extends Bird {
  public void helpGooseSwim() {
    Goose other = new Goose();
    other.floatInWater();
    System.out.println(other.text);
  }
  public void helpOtherGooseSwim() {
    Bird other = new Goose();

    // bird is example of different instance not
    // inherited
//    other.floatInWater();
//    System.out.println(other.text);
  }
}
