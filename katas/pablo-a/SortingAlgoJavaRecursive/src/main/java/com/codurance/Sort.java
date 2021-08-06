package com.codurance;

import java.util.List;

import static java.util.Arrays.asList;

public class Sort {
  public <T extends Comparable> List<T> sort(List<T> list) {
    if (list != null && list.size() > 1){
      order(list, 0, list.size() - 1);
    }
    return list;
  }

  private <T extends Comparable> List<T> order(List<T> list, int firstIndex, int lastIndex){
    if (lastIndex <= firstIndex) {
      return list;
    }

    T first = list.get(firstIndex);
    T last = list.get(lastIndex);

    if (first.compareTo(last) > 0){
      list.set(firstIndex, last);
      list.set(lastIndex, first);
      order(list, firstIndex, lastIndex - 1);
    }else if (last.compareTo(first) > 0){
      order(list, firstIndex, lastIndex - 1);
    }

    return order(list, firstIndex + 1, lastIndex - 1);
  }
}
