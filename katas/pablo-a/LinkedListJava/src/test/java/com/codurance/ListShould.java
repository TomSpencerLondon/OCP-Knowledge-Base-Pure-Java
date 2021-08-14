package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListShould {
  @Test
  public void throwAnException_when_get_on_empty_list() {
    final List<Integer> list = new List<>();
    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(0);
    });
  }

  @Test
  void get_size_0_when_list_is_empty() {
    final List<Integer> list = new List<>();
    final int size = list.size();

    assertThat(size).isEqualTo(0);
  }

  @Test
  void get_size_1_when_list_has_one_element() {
    final List<Integer> list = new List<>();
    list.add(1);
    final int size = list.size();

    assertThat(size).isEqualTo(1);
  }

  @Test
  void get_size_2_when_list_has_two_elements() {
    final List<Integer> list = new List<>();
    list.add(1);
    list.add(2);
    final int size = list.size();

    assertThat(size).isEqualTo(2);
  }

  @Test
  void get_element_from_index_0_from_list_with_one_element() {
    final List<Integer> list = new List<>();
    list.add(1);

    final Integer integer = list.get(0);

    assertThat(integer).isEqualTo(1);
  }

  @Test
  void get_element_from_index_1_from_list_with_two_elements() {
    final List<Integer> list = new List<>();
    list.add(1);
    list.add(2);

    final Integer integer = list.get(1);

    assertThat(integer).isEqualTo(2);
  }

  @Test
  void get_element_from_index_0_from_list_with_two_elements() {
    final List<Integer> list = new List<>();
    list.add(1);
    list.add(2);

    final Integer integer = list.get(0);

    assertThat(integer).isEqualTo(1);
  }

  @Test
  void get_element_from_index_1_from_list_with_three_elements() {
    final List<Integer> list = new List<>();
    list.add(1);
    list.add(2);
    list.add(3);

    final Integer integer = list.get(1);

    assertThat(integer).isEqualTo(2);
  }

  @Test
  void throwAnException_when_requesting_index_2_on_two_elements_list() {
    final List<Integer> list = new List<>();
    list.add(1);
    list.add(2);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(2);
    });
  }

  @Test
  void throwAnException_when_requesting_index_minus1_on_one_elements_list() {
    final List<Integer> list = new List<>();
    list.add(1);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(-1);
    });
  }
}
