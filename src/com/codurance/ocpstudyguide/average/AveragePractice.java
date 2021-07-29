package com.codurance.ocpstudyguide.average;
import java.util.stream.*;
public class AveragePractice {
  public static void main(String[] args) {
    var nums1 = IntStream.range(1, 5);
    var nums2 = IntStream.range(1, 5);
    var nums3 = IntStream.range(1, 5);

//    double average = nums1.collect(Collectors.averagingInt(i -> i));
////
//    double average1 = nums1.mapToObj(i -> i).collect(Collectors.averagingInt(i -> i));
//    double average2 = nums2.average().getAsDouble();
//    double average3 = nums3.parallel().mapToDouble(i -> i).average().getAsDouble();
//
//    System.out.println(average1);
//    System.out.println(average2);
//    System.out.println(average3);
  }
}
