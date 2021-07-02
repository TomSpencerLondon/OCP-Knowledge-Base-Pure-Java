package com.codurance.ocpstudyguide.classdesign.castingobjects;

public class Capybara extends Rodent {
  public static void main(String[] args) {
    final Rodent rodent = new Rodent();
    Capybara capybara = (Capybara)rodent;
  }
}
