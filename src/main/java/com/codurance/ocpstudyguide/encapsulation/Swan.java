package com.codurance.ocpstudyguide.encapsulation;

public class Swan {
  private int numberEggs;

  public int getNumberEggs() {
    return numberEggs;
  }

  public void setNumberEggs(int newNumber) {
    if (newNumber >= 0)
      numberEggs = newNumber;
  }
}
