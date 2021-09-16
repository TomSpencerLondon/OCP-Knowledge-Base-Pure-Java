package com.codurance.feature;

import com.codurance.Account;
import com.codurance.Clock;
import com.codurance.Console;
import com.codurance.Repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class PrintStatementFeatureTest {
  @Mock
  Console console;
  @Mock
  Clock clock;

  Repository repository;
  private Account account;

  @BeforeEach
  void setUp() {
    repository = new Repository(clock);
    account = new Account(console, repository);
  }

  @Test
  public void print_statement_containing_all_transactions() {
    given(clock.getDate()).willReturn("01/04/2014", "02/04/2014", "10/04/2014");
    account.deposit(1000);
    account.withdraw(100);
    account.deposit(500);
    account.printStatement();



    InOrder inOrder = Mockito.inOrder(console);

    inOrder.verify(console).printLine("DATE | AMOUNT | BALANCE");
    inOrder.verify(console).printLine("10/04/2014 | 500.00 | 1400.00");
    inOrder.verify(console).printLine("02/04/2014 | -100.00 | 900.00");
    inOrder.verify(console).printLine("01/04/2014 | 1000.00 | 1000.00");
  }
}
