package com.codurance.ocpstudyguide.methodsandencapsulation;

public class Methods {
  public static void walk(int start, int... nums) {
    System.out.println(nums.length);
  }
  public static void main(String[] args) {
    walk(1);
    walk(1,2);
    walk(1, 2, 3);
    walk(1, new int[] { 4, 5});

    run(11, 22);
  }

  public static void run(int... nums){
    System.out.println(nums[1]);
  }
}
