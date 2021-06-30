package com.codurance.ocpstudyguide.staticversusinstance;

import java.util.ArrayList;

public class Initializers {
  public static int counter = 0;
  private static final int NUM_BUCKETS = 45;
  private static final ArrayList<String> values = new ArrayList<>();

  private static final int NUM_SECONDS_PER_MINUTE;
  private static final int NUM_MINUTES_PER_HOUR;
  private static final int NUM_SECONDS_PER_HOUR;

  static {
    NUM_SECONDS_PER_MINUTE = 60;
    NUM_MINUTES_PER_HOUR = 60;
  }

  static {
    NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
  }

  private static int one;
  private static final int two;
  private static final int three = 3;
//  Variable 'four' might not have been initialized
//  private static final int four;

  static {
    one = 1;
    two = 2;

//    Cannot assign a value to final variable 'three'
//    three = 3;
//    Variable 'two' might already have been assigned to
//    two = 4;
  }


  public static void main(String[] args){
    values.add("changed");
    // final cannot be reassigned
//    NUM_BUCKETS = 5;
  }
}
