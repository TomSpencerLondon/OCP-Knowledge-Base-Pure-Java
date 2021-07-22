package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortShould {
  @Test
  void return_empty_array_for_null() {

    final Sort sort = new Sort();
    final int[] sorted = sort.sort();

    assertArrayEquals(sorted, new int[]{});
  }

  @Test
  void return_single_entry_for_single_entry_array() {
    final Sort sort = new Sort();
    final int[] sorted = sort.sort(1);

    assertArrayEquals(sorted, new int[]{1});
  }

  @Test
  void return_sorted_array_for_two_numbers() {
    final Sort sort = new Sort();
    final int[] sorted = sort.sort(2, 1);

    assertArrayEquals(sorted, new int[]{1, 2});
  }

  @Test
  void return_sorted_array_for_two_sorted_numbers() {
    final Sort sort = new Sort();
    final int[] sorted = sort.sort( 1, 2);

    assertArrayEquals(sorted, new int[]{1, 2});
  }

  @Test
  void return_sorted_array_for_three_unsorted_numbers() {
    final Sort sort = new Sort();
    final int[] sorted = sort.sort( 3, 2, 1);

    assertArrayEquals(sorted, new int[]{1, 2, 3});
  }

  @Test
  void return_sorted_array_for_four_numbers() {
    final Sort sort = new Sort();
    final int[] sorted = sort.sort( 3, 4, 2, 1);

    assertArrayEquals(sorted, new int[]{1, 2, 3, 4});
  }

  @Test
  void return_sorted_array_for_five_numbers() {
    final Sort sort = new Sort();
    final int[] sorted = sort.sort( 3, 4, 2, 5, 1);

    assertArrayEquals(sorted, new int[]{1, 2, 3, 4, 5});
  }
}

