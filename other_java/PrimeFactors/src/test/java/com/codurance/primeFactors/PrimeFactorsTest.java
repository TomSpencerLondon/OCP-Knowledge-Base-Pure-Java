package com.codurance.primeFactors;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {
  @Test
  public void of_1isNone() {
    assertThat(PrimeFactors.of(1), is(ImmutableList.of()));
  }

  @Test
  void of_2Is2() {
    assertThat(PrimeFactors.of(2), is(ImmutableList.of(2)));
  }

  @Test
  void of_3Is3() {
    assertThat(PrimeFactors.of(3), is(ImmutableList.of(3)));
  }

  @Test
  void of_4Is2_2() {
    assertThat(PrimeFactors.of(4), is(ImmutableList.of(2, 2)));
  }

  @Test
  void of_6Is2_3() {
    assertThat(PrimeFactors.of(6), is(ImmutableList.of(2, 3)));
  }

  @Test
  void of_8Is_2_2_2() {
    assertThat(PrimeFactors.of(8), is(ImmutableList.of(2, 2, 2)));
  }

  @Test
  void of_9Is_3_3_3() {
    assertThat(PrimeFactors.of(9), is(ImmutableList.of(3, 3)));
  }

  @Test
  void of_20Is_2_2_5() {
    assertThat(PrimeFactors.of(20), is(ImmutableList.of(2, 2, 5)));
  }

  @Test
  void of_acceptanceTest() {
    assertThat(PrimeFactors.of(2*2*2*3*3*5*7*11), is(ImmutableList.of(2, 2, 2, 3, 3, 5, 7, 11)));
  }
}
