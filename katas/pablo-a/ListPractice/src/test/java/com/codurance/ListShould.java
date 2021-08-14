package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ListShould {
  @Test
  public void have_sizeOfZero_when_empty() {
    List<Integer> list = new List<>(Integer.class);
    int size = list.size();

    assertThat(size).isEqualTo(0);
  }

  @Test
  void have_sizeOfOne_when_has_one_element() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    int size = list.size();

    assertThat(size).isEqualTo(1);
  }

  @Test
  void get_element_fromEmptyArray_throwsAnException() {
    List<Integer> list = new List<>(Integer.class);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(0);
    });
  }

  @Test
  void get_element_from_list_with_one_element_returns_the_element() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);

    int integer = list.get(0);

    assertThat(integer).isEqualTo(1);
  }

  @Test
  void get_element_at_position_1_from_list_with_one_element_throwsException() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(1);
    });
  }

  @Test
  void get_element_at_position_2_from_list_with_two_elements_throwsException() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(2);
    });
  }

  @Test
  void gets_second_element_from_list_with_two_elements() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);

    int result = list.get(1);

    assertThat(result).isEqualTo(2);
  }


  @Test
  void gets_first_element_from_list_with_two_elements() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);

    int result = list.get(0);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void add_three_elements_and_remove_one_should_have_sizeOfTwo() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);
    list.add(3);

    list.remove(2);

    int size = list.size();

    assertThat(size).isEqualTo(2);
  }

  @Test
  void add_three_elements_and_remove_one_should_return_element() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);
    list.add(3);

    Integer removed = list.remove(1);

    assertThat(removed).isEqualTo(2);
  }

  @Test
  void add_three_elements_and_remove_one_should_leave_element_zero() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);
    list.add(3);

    list.remove(1);
    Integer first = list.get(0);

    assertThat(first).isEqualTo(1);
  }

  @Test
  void add_three_elements_and_remove_second_should_leave_third_as_second() {
    List<Integer> list = new List<>(Integer.class);
    list.add(1);
    list.add(2);
    list.add(3);

    list.remove(1);
    Integer second = list.get(1);

    assertThat(second).isEqualTo(3);
  }
}
