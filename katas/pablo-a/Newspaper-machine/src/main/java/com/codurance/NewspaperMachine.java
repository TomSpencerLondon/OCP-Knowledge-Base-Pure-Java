package com.codurance;

public class NewspaperMachine {
  private int amount;

  public void insert(int amount) {
    this.amount += amount;
  }

  public void getNewspaper() throws NotEnoughMoneyException {
    if (this.amount < 150) {
      throw new NotEnoughMoneyException();
    }
    this.amount = 0;
  }
}
