package com.codurance.ocppracticeexam.exam2;

public class StringPractice {
    public static void main(String[] args) {
        String examName = "OCP Java 11";
        String uniqueExamName = new String(examName);
        String internedExamName = uniqueExamName.intern();
        System.out.println(
                (examName==uniqueExamName)+" "+
                        (examName == internedExamName)+" "+
                        (uniqueExamName == internedExamName)
        );
    }
}
