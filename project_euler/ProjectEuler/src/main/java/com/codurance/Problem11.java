package com.codurance;

import java.util.ArrayList;
import java.util.List;

class Position {
  final int x;
  final int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Problem11 {
  private final List<List<Integer>> numbers;
  private Position position = new Position(0, 0);

  public Problem11(List<List<Integer>> numbers) {
    this.numbers = numbers;
  }


  public Integer getRightDownProduct(Position position) {
    if (position.x > 16 || position.y > 16) {
      return 0;
    }

    List<Integer> list = new ArrayList<Integer>();
    list.add(numbers.get(position.y).get(position.x));
    list.add(numbers.get(position.y + 1).get(position.x + 1));
    list.add(numbers.get(position.y + 2).get(position.x + 2));
    list.add(numbers.get(position.y + 3).get(position.x + 3));

    return list.stream().reduce(1, (a, b) -> a * b);
  }

  public Integer getLeftDownProduct(Position position) {
    if (position.x < 3 || position.x > 19 || position.y > 16) {
      return 0;
    }

    List<Integer> list = new ArrayList<>();
    list.add(numbers.get(position.y).get(position.x));
    list.add(numbers.get(position.y + 1).get(position.x - 1));
    list.add(numbers.get(position.y + 2).get(position.x - 2));
    list.add(numbers.get(position.y + 3).get(position.x - 3));

    return list.stream().reduce(1, (a, b) -> a * b);
  }

  public Integer getDown(Position position) {
    if (position.x > 19 || position.y > 16) {
      return 0;
    }

    List<Integer> list = new ArrayList<>();
    list.add(numbers.get(position.y).get(position.x));
    list.add(numbers.get(position.y + 1).get(position.x));
    list.add(numbers.get(position.y + 2).get(position.x));
    list.add(numbers.get(position.y + 3).get(position.x));

    return list.stream().reduce(1, (a, b) -> a * b);
  }
}
