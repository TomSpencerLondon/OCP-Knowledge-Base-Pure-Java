package com.codurance.ocppracticeexam.exam2;

public class TestClass {
    public class A {
    }

    public static class B {
    }
    public static void main(String args[]) {
        class C {
        }
        // 1
        new TestClass().new A();
    }
}
//
//    Please select 2 options
//        A. new TestClass().new A();
//        B. new TestClass().new B();
//        C. new TestClass().A();
//        D. new C();
//        E. new TestClass.C();
//
//        Answer: