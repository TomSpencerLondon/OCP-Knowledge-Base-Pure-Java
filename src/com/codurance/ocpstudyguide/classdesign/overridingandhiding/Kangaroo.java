package com.codurance.ocpstudyguide.classdesign.overridingandhiding;

public class Kangaroo extends Marsupial {
  protected int age = 6;

  public static boolean isBiped() {
    return true;
  }

  public static void main(String[] args){
    Kangaroo joey = new Kangaroo();
    Marsupial moey = joey;

    // Hidden static methods
    System.out.println(joey.isBiped());
    System.out.println(moey.isBiped());
    System.out.println(joey.age);
    System.out.println(moey.age);

  }
}
