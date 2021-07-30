package com.codurance.ocpstudyguide.hidingvariables;

public class Meerkat extends Carnivore {
  protected boolean hasFur = true;

  public static void main(String[] args) {
    final Meerkat meerkat = new Meerkat();
    Carnivore c = meerkat;
    System.out.println(meerkat.hasFur);

    System.out.println(c.hasFur);
  }
}
