package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SortShould {
  @Test
  void return_null_if_get_null() {
    final Sort sort = new Sort();

    final List<Integer> sorted = sort.sort(null);

    assertThat(sorted).isNull();
  }

  @Test
  void list_of_one_element_returns_list() {
    final Sort sort = new Sort();

    List<Integer> list = asList(1);

    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(list);
  }

  @Test
  void list_of_two_elements_is_sorted() {
    final Sort sort = new Sort();

    List<Integer> list = asList(1, 2);

    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(list);
  }

  @Test
  void list_of_two_unsorted_elements_is_sorted() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2);

    List<Integer> list = asList(2, 1);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }

  @Test
  void list_of_three_sorted_elements_is_sorted() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2, 3);

    List<Integer> list = asList(1, 2, 3);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }

  @Test
  void three_elements_last_two_not_sorted() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2, 3);

    List<Integer> list = asList(2, 1, 3);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }

  @Test
  void three_elements_reversed_to_ordered_elements() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2, 3);

    List<Integer> list = asList(3, 2, 1);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }

  @Test
  void four_elements_last_two_not_sorted() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2, 3, 4);

    List<Integer> list = asList(1, 3, 2, 4);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }

  @Test
  void four_elements_reversed_to_ordered_elements() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2, 3, 4);

    List<Integer> list = asList(4, 3, 2, 1);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }

  @Test
  void two_elements_same_to_ordered_elements() {
    final Sort sort = new Sort();
    List<Integer> expected = asList(1, 2, 4, 4);

    List<Integer> list = asList(4, 4, 2, 1);
    final List<Integer> sorted = sort.sort(list);

    assertThat(sorted).isEqualTo(expected);
  }
}
