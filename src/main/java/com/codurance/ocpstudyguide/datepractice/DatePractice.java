package com.codurance.ocpstudyguide.datepractice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatePractice {
  public static void main(String[] args) {
    final SimpleDateFormat month = new SimpleDateFormat("MMMM", Locale.ENGLISH);
    System.out.println(month.format(new Date()));

    double tenthousand = 10_00000;

    int[][] array = new int[3][3];
    
  }
}
