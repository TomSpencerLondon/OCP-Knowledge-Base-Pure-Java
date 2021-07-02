package com.codurance.ocpstudyguide.classdesign.thisreference;

public class Flamingo {
  private String color;
  public void setColor(String color) {
    this.color = color;
  }

  public static void main(String[] args) {
    Flamingo flamingo = new Flamingo();
    flamingo.setColor("PINK");
    System.out.println(flamingo.color);
  }
}
