package com.codurance.effectiveJava.item7;

import java.util.Arrays;
import java.util.*;

public class Stack {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  // Bad because it creates inadvertent
  // memory leak
  // Need to set elements[size] to null in order to eliminate the obsolete
  // reference
//  public Object pop() {
//    if (size == 0){
//      throw new EmptyStackException();
//    }
//
//    return elements[--size];
//  }

  private void ensureCapacity() {
    if (elements.length == size){
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

  // corrected version of pop method (Page 27)

  public Object pop() {
    if (size == 0) throw new EmptyStackException();

    Object result = elements[--size];
    elements[size] = null; // Eliminate obsolete reference
    return result;
  }
}










