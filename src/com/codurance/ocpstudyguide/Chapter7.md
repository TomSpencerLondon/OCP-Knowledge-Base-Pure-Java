# Review questions

1. Which of the following can fill in the blank in this code to make it compile?
(Choose all that apply.)

public class Ant {
    ____ void method() {}
}

A. default
B. final
C. private
D. Public
E. String
F. zzz:

Answer: A, C, D

2. Which of the following methods compile? (Choose all that apply.)
A. final static void method4() {}
B. public final int void method() {}
C. private void int method() {}
D. static final void method3() {}
E. void final method() {}
F. void public method() {}

Answer: B, C, D

3. Which of the following methods compile? (Choose all that apply.)
A. public void methodA() { return; }
B. public int methodB() { return null; }
C. public void methodC() {}
D. public int methodD() { return 9; }
E. public int methodE() { return 9.0; }
F. public int methodF() { return; }

Answer: A, B, C, D

4. Which of the following methods compile? (Choose all that apply.)
A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(){ return 9;}
E. public void methodE() { return 9.0;}
F. public int methodF() { return; }

Answer: A, C

5. Given the following method, which of the method calls return 2? (Choose all that apply.)
public int howMany(boolean b, boolean... b2) {
    return b2.length;
}

A. howMany();
B. howMany(true);
C. howMany(true, true);
D. howMany(true, true, true);
E. howMany(true, {true, true});
F. howMany(true, new boolean[2]);

Answer: D, F

6. Which of the following statements is true?
A. Package-private access is more lenient than protected access.
B. A public class that has private fields and package-private methods
is not visible to classes outside the package.
C. You can use access modifiers so only some of the classes in a package see
a particular package-private class.
D. You can use access modifiers to allow access to all methods and not any instance
variables.
E. You can use access modifiers to restrict access to all classes that begin with
the word Test.

Answer: A, D

7. Given the following my.school.Classroom and my.city.School class definitions, which line
numbers in main() generate a compiler error? (Choose all that apply.)

1: package my.school;
2: public class Classroom {
3:      private int roomNumber;
4:      protected static String teacherName;
5:      static int globalKey = 54321;
6:      public static int floor = 3;
7:      Classroom(int r, String t) {
8:          roomNumber = r;
9:          teacherName = t; } }

1: package my.city;
2: import my.school.*;
3: public class School {
4:      public static void main(String[] args) {
5:          System.out.println(Classroom.globalKey);
6:          Classroom room = new Classroom(101, "Mrs. Anderson");
7:          System.out.println(room.roomNumber);
8:          System.out.println(Classroom.floor);
9:          System.out.println(Classroom.teacherName); } }

A: None the code compiles fine.
B: Line 5
C: Line 6
D: Line 7
E: Line 8
F: Line 9

Answer: B - protected means variable is available to package and children packages
my.city is not a child of my.school;

8. Which of the following are true about encapsulation? (Choose all that apply.)
A. It allows getters.
B. It allows setters.
C. It requires specific naming conventions.
D. It uses package-private instance variables.
E. It uses private instance variables.

Answer: A, B, E


9. Which pairs of methods are valid overloaded pairs (Choose all that apply.)
A.
public void hiss(Iterable i) {}
and
public int hiss(Iterable i) { return 0; }
B.
public void baa(CharSequence c) {}
and
public void baa(String s) {}
C.
public var meow(List<String> l) {}
and
public var meow(String s) {}
D.
public void moo(Object o) {}
and
public void moo(String s) {}
E.
public void roar(List<Boolean> b) {}
and
public void roar(List<Character> c) {}
F.
public void woof(boolean[] b1) {}
and
public void woof(Boolean[] b) {}
Answer: B, D, F
