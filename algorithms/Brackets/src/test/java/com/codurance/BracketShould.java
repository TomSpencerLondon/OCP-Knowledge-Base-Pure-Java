package com.codurance;

import org.junit.jupiter.api.Test;

import static com.codurance.Bracket.isBalanced;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketShould {
  @Test
  void balanced_brackets_returns_true() {
    assertTrue(isBalanced("(({}))"));
  }

  @Test
  void unbalanced_brackets_return_false() {
    assertFalse(isBalanced("(({))}"));
  }
}
