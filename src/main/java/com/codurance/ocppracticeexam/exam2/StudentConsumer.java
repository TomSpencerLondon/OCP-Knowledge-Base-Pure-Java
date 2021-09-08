package com.codurance.ocppracticeexam.exam2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StudentConsumer {
  private String name;
  private int marks;

  public StudentConsumer(String name, int marks){
    this.name = name;
    this.marks = marks;
  }

  public void addMarks(int m){
    this.marks += m;
  }

  public void debug(){
    System.out.println(name + ":" + marks);
  }

  public static void main(String[] args) {
    List<StudentConsumer> slist = List.of(new StudentConsumer("S1", 40), new StudentConsumer("S2", 35), new StudentConsumer("S3", 30));
    Consumer<StudentConsumer> increaseMarks = s -> s.addMarks(10);
    slist.forEach(increaseMarks);
    slist.stream().forEach(StudentConsumer::debug);
  }
}
