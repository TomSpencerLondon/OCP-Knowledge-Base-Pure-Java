package com.codurance.ocpstudyguide.classdesign.constructorsandfinalfields;

public class Mousehouse2 {
  private final int volume;

  private final String type;

  {
    this.volume = 10;
  }

  public Mousehouse2(String type) {
    this.type = type;
  }

  public Mousehouse2() {
//    this.volume = 2; // does not compile
    this(null);
  }
}
