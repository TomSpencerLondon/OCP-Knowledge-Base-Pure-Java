package com.codurance.ocppracticeexam.exam2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter sdf = ofPattern("MM/yy");
        System.out.println(sdf.format(LocalDate.now()));

//        A. DateTimeFormatter sdf = DateTimeFormatter.ofPattern("mm/yy");
//        B. DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/yy");
//        C. DateTimeFormatter sdf = ofPattern("mm/YY");
//        D. DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/YY");
    }
}
