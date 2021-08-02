package com.codurance;

public class List<T> {
  private T[] elements;

  public List(Class<T> klass) {
    elements = (T[]) new Object[0];
  }

  public int size() {
    return elements.length;
  }

  public T get(int index) {
    if (size() <= index){
      throw new IndexOutOfBoundsException();
    }else {
      return elements[index];
    }
  }

  public void add(T element) {
    T[] array = (T[]) new Object[size() + 1];
    for (int i = 0; i < elements.length; i++){
      array[i] = elements[i];
    }
    array[size()] = element;
    elements = array;
  }

  public T remove(int index) {
    var removedElement = elements[index];

    T[] array = (T[]) new Object[size() - 1];
    for (int i = 0, j = 0; i < elements.length; i++){
      if (index != i){
        array[j] = elements[i];
        j++;
      }
    }
    elements = array;
    return removedElement;
  }
}
