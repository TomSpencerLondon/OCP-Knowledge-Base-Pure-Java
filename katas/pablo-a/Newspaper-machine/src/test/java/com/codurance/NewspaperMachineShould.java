package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewspaperMachineShould {

  private NewspaperMachine machine;

  @BeforeEach
  void setUp() {
    machine = new NewspaperMachine();
  }

  @Test
  public void give_a_newspaper_when_correct_money_is_provided() throws NotEnoughMoneyException {
    machine.insert(150);

    machine.getNewspaper();
  }

  @Test
  void throw_not_enough_money_exception_when_less_money_provided() {
    machine.insert(100);

    assertThrows(NotEnoughMoneyException.class, () -> machine.getNewspaper());
  }

  @Test
  void give_a_newspaper_when_insert_50_then_100() throws NotEnoughMoneyException {
    machine.insert(50);
    machine.insert(100);

    machine.getNewspaper();
  }

  @Test
  void refuse_newspaper_to_second_person_with_50_when_first_has_got_newspaper() throws NotEnoughMoneyException {
    machine.insert(50);
    machine.insert(100);
    machine.getNewspaper();
    machine.insert(50);

    assertThrows(NotEnoughMoneyException.class, () -> machine.getNewspaper());
  }
}
