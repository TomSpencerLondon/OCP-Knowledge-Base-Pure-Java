package com.codurance;

import io.cucumber.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class StackStepDefinitions implements En {

  private Integer value;
  private Stack<Integer> stack;

  private Exception exception;

  public StackStepDefinitions(){
    Given("I have an empty stack", () -> {
      stack = new Stack<>();
    });

    When("I pop an element", () -> {
      try {
        value = stack.pop();
      }catch (Exception e) {
        exception = e;
      }
    });

    When("^I push (\\d+)$", (Integer number) -> {
      stack.push(number);
    });

    Then("I get an error", () -> {
      assertThat(exception).isNotNull();
    });

    Then("^I get (\\d+)$", (Integer number) -> {
      assertThat(value).isEqualTo(number);
    });
  }
}
