# Review questions
✅ means correct

❌ means incorrect
 

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

❌ Incorrect answer - B, C.

Which of the following methods compile? (Choose all that apply.)
A. final static void method4() {}
B. public final int void method() {}
C. private void int method() {}
D. static final void method3() {}
E. void final method() {}
F. void public method() {}

Answer: B, C, D

❌ Incorrect answer - A, D

3. Which of the following methods compile? (Choose all that apply.)
A. public void methodA() { return; }
B. public int methodB() { return null; }
C. public void methodC() {}
D. public int methodD() { return 9; }
E. public int methodE() { return 9.0; }
F. public int methodF() { return; }

Answer: A, B, C, D

❌ Incorrect answer - A,C, D - null requires an object
reference as a return type


4. Which of the following methods compile? (Choose all that apply.)
A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(){ return 9;}
E. public void methodE() { return 9.0;}
F. public int methodF() { return; }

Answer: A, C

❌ Incorrect answer - A, B, F


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

✅ Correct answer - Yay!

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
❌ Incorrect answer - D.

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

❌ Incorrect answer - B, C, D, F

8. Which of the following are true about encapsulation? (Choose all that apply.)
A. It allows getters.
B. It allows setters.
C. It requires specific naming conventions.
D. It uses package-private instance variables.
E. It uses private instance variables.

Answer: A, B, E
✅ Yay - correct!

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
✅ Yay! Correct!

10. What is the output of the following code?

1: package rope;
2: public class Rope {
3:      public static int LENGTH = 5;
4:      static {
5:          LENGTH = 10;
6:      }
7:      public static void swing() {
8:          System.out.println("swing ");
9:      } }

1: import rope.*;
2: import static rope.Rope.*;
3: public class Chimp {
4:      public static void main(String[] args) {
5:          Rope.swing();
6:          new Rope().swing();
7:          System.out.println(LENGTH);
8:     } }

A. swing swing 5
B. swing swing 10
C. Compiler error on line 2 of Chimp
D. Compiler error on line 5 of Chimp
E. Compiler error on line 6 of Chimp
F. Compiler error on line 7 of Chimp

Answer: E

❌ Incorrect answer - B

11. Which statements are true of the following code? (Choose all that apply.)
1: public class Rope {
2:      public static void swing() {
3:          System.out.print("swing");
4:      }
5:      public void climb() {
6:          System.out.print("climb");
7:      }
8:      public static void play() {
9:          swing();
10:         climb();
11:     }
12:     public static void main(String[] args) {
13:         Rope rope = new Rope();
14:         rope.play();
15:         Rope rope2 = null;
16:         System.out.print("-");
17:         rope2.play();
18:     } }

A. The code compiles as is.
B. There is exactly one compiler error in the code.
C. There are exactly two compiler errors in the code.
D. If the lines with compiler errors are removed, the output is swing-climb.
E. If the lines with compiler errors are removed, the output is swing-swing.
F. If the lines with compile errors are removed, the code throws a NullPointerException.

Answer: B, F

❌ Incorrect answer - B, E

12. What is the output of the following code?

import rope.*;
import static rope.Rope.*;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    
    {
        System.out.println(rope1.length);
    }
    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}

package rope;
public class Rope {
    public static int length = 0;
}

A. 02
B. 08
C. 2
D. 8
E. The code does not compile
F. An exception is thrown.

Answer: E

❌ Incorrect answer - correct answer is 


13. How many lines in the following code have compiler errors?
1: public class RopeSwing {
2:      private static final String leftRope;
3:      private static final String rightRope;
4:      private static final String bench;
5:      private static final String name = "name";
6:      static {
7:          leftRope = "left";
8:          rightRope = "right";
9:      }
10:     static {
11:         name = "name";
12:         rightRope = "right";
13:     }
14:     public static void main(String[] args) {
15:         bench = "bench";
16:     }
17: }

A. 0
B. 1
C. 2
D. 3
E. 4
F. 5

Answer: D
❌ Incorrect answer - E
line 4 (no initialization)
line 15 (can't change final)
line 11 (final name is set twice)
line 12 (final rightRope set twice)

14. Which of the following can replace line 2 to make this code compile? (Choose all that apply.)

1: import java.util.*;
2: // INSERT CODE HERE
3: public class Imports {
4:      public void method(ArrayList<String> list) {
5:          sort(list);
6:      }
7: }

A. import static java.util.Collections;
B. import static java.util.Collections.*;
C. import static java.util.Collections.sort(ArrayList<String>);
D. static import java.util.Collections;
E. static import java.util.Collections.*;
F. static import java.util.Collections.sort(ArrayList<String>);

Answer: B
✅ Correct - yay! - There are two ways:
1. import static java.util.Collections.*;
2. import static java.util.Collections.sort;


15. What is the result of the following statements?

1: public class Test {
2:      public void print(byte x) {
3:            System.out.print("byte-");
4:      }
5:      public void print(int x) {
6:          System.out.print("int-");
7:      }
8:      public void print(float x) {
9:          System.out.print("float-");
10:     }
11:     public void print(Object x) {
12:         System.out.print("Object-");
13:     }
14:     public static void main(String[] args) {
15:         Test t = new Test();
16:         short s = 123;
17:         t.print(s);
18:         t.print(true);
19:         t.print(6.789);
20:     }
21: }

A. byte-float-Object-
B. int-float-Object-
C. byte-Object-float-
D. int-Object-float-
E. int-Object-Object-
F. byte-Object-Object-        

Answer: D

❌ Incorrect answer - E.
short promoted to int
boolean - promoted to Object (no Boolean autobox available)
double - autoboxed to Double - Therefore Object is called (parent of Double)

16. What is the result of the following program?

1: public class Squares {
2:      public static long square(int x) {
3:          var y = x * (long) x;
4:          x = -1;
5:          return y;
6:      }
7:      public static void main(String[] args) {
8:          var value = 9;
9:          var result = square(value);
10:         System.out.println(value);
11:     } }

A. -1
B. 9
C. 81
D. Compiler error on line 9
E. Compiler error on a different line

Answer: C - 81
❌ Incorrect answer - D.
Java is pass by value - value variable is not reassigned therefore it stays the same


17. Which of the following are output by the following code? (Choose all that apply.)

public class StringBuilders {
    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;    
    }
    public static void main(String[] args) {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
}

A. s1 = a;
B. s1 = s1;
C. s2 = s2;
D. s2 = s2b;
E. s3 = a;
F. The code does not compile.

Answer: B, C, E
❌ Incorrect answer - B, D, E
Java is pass by value -
B is correct s1 = s1
D is correct - s2 = s2b - b.append does affect the caller. 
E is correct as a is returned from work(s1, s2) - this is pass by value example


18. Which of the following will compile when independently inserted in the following code?
(Choose all that apply.)

1: public class Order3 {
2:      final String value1 = "red";
3:      static String value2 = "blue";
4:      String value3 = "yellow";
5:      {
6:          // CODE SNIPPET 1
7:      }
8:      static {
9:          // CODE SNIPPET 2
10:     } }

A. Insert at line 6: value1 = "green";
B. Insert at line 6: value2 = "purple";
C. Insert at line 6: value3 = "orange";
D. Insert at line 9: value1 = "magenta";
E. Insert at line 9: value2 = "cyan";
F. Insert at line 9: value3 = "turquoise";

Answer: C, E

19. Which of the following are true about the following code? (Choose all that apply.)

public class Run {
    static void execute() {
        System.out.print("1-");
    }
    static void execute(int num) {
        System.out.print("2-");
    }
    static void execute(Integer num) {
        System.out.print("3-");
    }
    static void execute(Object num) {
        System.out.print("4-");
    }
    static void execute(int... nums) {
        System.out.print("5-");
    }
    public static void main(String[] args) {
        Run.execute(100);
        Run.execute(100L);
    }
}

A. The code prints out 2-4-.
B. The code prints out 3-4-.
C. The code prints out 4-2-.
D. The code prints out 4-4-.
E. The code prints 3-4- if you remove the method static void execute(int num).
F. The code prints 4-4- if you remove the method static void execute(int num).

Answer: A, E

20. Which pairs of methods are valid overloaded pairs? (Choose all that apply.)
A.
public void hiss(Set<String> s) {}
and
public void hiss(List<String> l) {}
B.
public void baa(var c) {}
and
public void baa(String s) {}
C.
public void meow(char ch) {}
and
public void meow(String s) {}
D.
public void moo(char ch) {}
and
public void moo(char ch) {}
E.
public void roar(long... longs) {}
and
public void roar(long long) {}
F.
public void woof(char... chars){}
and
public void woof(Character c) {}

Answer: B

21. Which can fill in the blank to create a properly encapsulated class? (Choose all that apply.)

public class Rabbits {
    ____ int numRabbits = 0;
    ____ void multiply() {
        numRabbits *= 6;
    }
    
    ____ int getNumberOfRabbits() {
        return numRabbits;
    }
}

A. private, public, and public
B. private, protected, and private
C. private, public, and protected
D. public, public, and public
E. None of the above since multiply() does not begin with set
F. None of the above for a reason other than the multiply() method

Answer: A, C




























