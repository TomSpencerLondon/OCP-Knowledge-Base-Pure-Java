package com.codurance.ocppracticeexam.exam15;

import java.util.ArrayList;
import java.util.Set;

public class BasePractice {
}

class Base {
  public ArrayList<Number> transform(Set<Integer> list) {
    // valid code
    return null;
  };
}

class Derived extends Base {
  public ArrayList<Number> transform(Set list) {
  // valid code
    return null;
  }
}
//
//    What can be inserted in the above code?
//    Please select 1 option
//    A. public List<Number> transform(Set<Integer> list) {
//    B. public List<Integer> transform(Set<Integer> list) {
//    C. public ArrayList<? super Integer> transform(Set<Integer> list) {
//    D. public ArrayList<? extends Integer> transform(Set<Integer> list) {
//    E. public ArrayList<Number> transform(Set list) {
//
