package com.codurance;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
  List<T> elements = new ArrayList<>();

  public T pop() {
    checkForEmptyStack();

    return elements.remove(elements.size() - 1);
  }

  private void checkForEmptyStack() {
    if (elements.isEmpty()) {
      throw new EmptyStackException();
    }
  }

  public void push(T element) {
    this.elements.add(element);
  }
}
