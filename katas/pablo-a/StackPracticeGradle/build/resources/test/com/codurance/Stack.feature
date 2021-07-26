Feature: Stack
  As a developer I want to have a stack so that I can stack function calls
  Scenario: Popping from an empty stack
    Given I have an empty stack
    When I pop an element
    Then I get an error
  Scenario: Popping from a stack with one element
    Given I have an empty stack
    When I push 1
    And I pop an element
    Then I get 1
  Scenario: Popping from a stack with two element
    Given I have an empty stack
    When I push 1
    And I push 2
    And I pop an element
    Then I get 2
  Scenario: Popping twice from a stack with two element
    Given I have an empty stack
    When I push 1
    And I push 2
    And I pop an element
    And I pop an element
    Then I get 1