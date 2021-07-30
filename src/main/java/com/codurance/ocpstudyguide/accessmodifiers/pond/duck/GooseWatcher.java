package com.codurance.ocpstudyguide.accessmodifiers.pond.duck;

import com.codurance.ocpstudyguide.accessmodifiers.pond.goose.Goose;

public class GooseWatcher {
  public void watch() {
    Goose goose = new Goose();
    // refers to object from different package
    // float in water is protected
//    goose.floatInWater();
  }
}
