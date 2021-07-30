package com.codurance.ocpstudyguide.classdesign.instanceinitialization;

public class Chimpanzee extends Ape {
  public Chimpanzee() {
    super(2);
    System.out.println("Chimpanzee-");
  }

  public static void main(String[] args){
    // This prints:
    // Primate-
    // Ape1-
    // Chimpanzee-
    new Chimpanzee();
  }
}
