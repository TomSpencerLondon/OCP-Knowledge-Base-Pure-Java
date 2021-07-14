✅ means correct

❌ means incorrect

1. What modifiers are implicitly applied to all interface methods
that do not declare a body? (Choose all that apply.)

A. protected
B. public
C. static
D. void
E. abstract
F. default

Answer: B, D, E
❌ Incorrect answer - answer was close - B, E.
Not void - because this is a return type.

2. Which of the following statements can be inserted in the
blank line so that the code will compile successfully? (choose all that apply.)

interface canHop {}
public class Frog implements CanHop {
    public static void main(String[] args) {
        _______ frog = new TurtleFrog();
    }
}

class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}

A. Frog
B. TurtleFrog
C. BrazilianHornedFrog
D. CanHop
E. Object
F. Long
G. None of the above; the code contains a compilation error.

Answer: A, B, E
❌ - Incorrect answer - close - correct answer was A, B, D, E
I missed out D. CanHop - So the type of frog can be CanHop as this is an interface.

3. Which of the following is true about a concrete class? (Choose all that apply.)
A. A concrete class can be declared as abstract.
B. A concrete class can implement all inherited abstract methods.
C. A concrete class can be marked as final.
D. If a concrete class inherits an interface from one of its superclasses, then it
must declare an implementation for all methods defined in that interface.
E. A concrete method that implements an abstract method must match the method declaration of the
abstract method exactly.

Answer: B, C, D
❌ - incorrect answer - almost correct again - just missed - not include D.
Correct answer as B, C.
B. A concrete class can implement all inherited abstract methods
C. A concrete class can be marked as final. 

4. Which statements about the following program are correct? (Choose all that apply.)

1: interface HasExoskeleton {
2:      double size = 2.0f;
3:      abstract int getNumberOfSections();
4: }
5: abstract class Insect implements HasExoskeleton {
6:      abstract int getNumberOfLegs();
7: }
8: public class Beetle extends Insect {
9:      int getNumberOfLegs() { return 6; }
10:     int getNumberOfSections(int count) { return 1; }
11: }

A. It compiles without issue.
B. The code will produce a ClassCastException if called at runtime.
C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
E. The code will not compile because of line 8.
F. The code will not compile because of line 10.

Answer: F - the code will not compile because of line 10.
❌ - Not correct
Correct answer was E.
The code will not compile because of line 8. Beetle does not extend Insect correctly.
It changes the signature of the method so does not correctly override the HasExoskeleton interface.

5. What modifiers are implicitly applied to all interface variables? (Choose all that apply.)
A. private
B. nonstatic
C. final
D. const
E. abstract
F. public
G. default (package-private)

Answer: C, F
✅ - Yay! Got this right.
These modifiers are implicitly applied to all interface variables:
C. final - functions on interfaces cannot be changed.
F. public - all interface variables are implicitly assumed to be public, static, and final.

6. Which statements about the following program are correct? (Choose all that apply.)

1: public abstract interface Herbivore {
2:      int amount = 10;
3:      public void eatGrass();
4:      public abstract int chew() { return 13; }
5: }
6:
7: abstract class IsAPlant extends Herbivore {
8:      Object eatGrass(int season) { return null; }
9: }

A. It compiles and runs without issue.
B. The code will not compile because of line 1.
C. The code will not compile because of line 2.
D. The code will not compile because of line 4.
E. The code will not compile because of line 7.
F. The code will not compile because line 8 contains an invalid method override.

Answer: F
❌ - This is definitely incorrect - The correct answer was D, E.
The code will not compile because of line 4. If a function is abstract it should have no function body.
The code code will also not compile because of line 7 making E correct.


7. Which statements about the following program are correct? (Choose all that apply.)

1: abstract class Nocturnal {
2:      boolean isBlind();
3: }
4: public class Owl extends Nocturnal {
5:      public boolean isBlind() { return false; }
6:      public static void main(String[] args) {
7:          var nocturnal = (Nocturnal) new Owl();
8:          System.out.println(nocturnal.isBlind());
9: } }

A. It compiles and prints true.
B. It compiles and prints false.
C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.
G. None of the above.

Answer: B
❌ This is incorrect - The correct answer was B. (line 2)
Correct was:
C. The code does not compile because the isBlind() method in Noctural is not
marked abstract and does not contain a method body. If the abstract modifier
was added to line 2 then the code would compile and print false at run time
- this would make B the correct answer.

8. Which statements are true about the following code? (Choose all that apply.)
interface Dog extends CanBark, HasVocalCords {
    abstract int chew();
}

public interface CanBark extends HasVocalCords {
    public void bark();
}

interface HasVocalCords {
    public abstract void makeSound();
}

A. The CanBark declaration doesn't compile.
B. A class that implements hasVocalCords must override the makeSound() method.
C. A class that implements CanBark inherits both the makeSound and bark() methods.
D. A class that implements Dog must be marked final.
E. The Dog declaration does not compile because an interface cannot extend two interfaces.

Answer: C
✅ Yay - I got it right. 
C - A class that implements CanBark inherits both the makeSound and bark() methods.

9. Which access modifiers can be applied to member inner classes? (Choose all that apply.)
A. static
B. public
C. default (package-private)
D. final
E. protected
F. private

Answer: A, B, C, E, F
❌ Incorrect - 
The correct answer was - B, C, E, F. Member inner classes, including both classes and interfaces,
can be marked with any of the four access modifiers: public, protected, default (package-private),
or private. For this reason, options B, C, E and F are correct. Options A and D are incorrect
as static and final are not access modifiers.

The static keyword indicates that the particular member belongs to a type itself, rather
than to an instance of that type.

10. Which statements are true about the following code? (Choose all that apply.)

5: public interface CanFly {
6:      int fly()
7:      String fly(int distance);
8: }
9: interface HasWings {
10:     abstract String fly();
11:     public abstract Object getWingSpan();
12: }
13: abstract class Falcon implements CanFly, HasWings {}

A. It compiles without issue.
B. The code will not compile because of line 5.
C. The code will not compile because of line 6.
D. The code will not compile because of line 7.
E. The code will not compile because of line 9.
F. The code will not compile because of line 10.
G. The code will not compile because of line 13.

Answer: C. 
❌ - Not quite - The correct answer was C, G
The implicitly abstract interface method on line 6 does not compile because it is missing a
semicolon (;), making option C correct. Line 7 compiles, as it provides an overloaded version of the
fly() method. Lines 5, 9 and 10 do not contain any compilation errors, making options A, E, and F
incorrect. Line 13 does not compile because the two inherited fly() methods, declared on line 6 and line

11. Which modifier pairs can be used together in a method declaration? (Choose all that apply.)
A. static and final
B. private and static
C. static and abstract
D. private and abstract
E. abstract and final
F. private and final

Answer: A, C, F

12. Which of the following statements about the FruitStand program are correct? (Choose all that apply.)

1: interface Apple {}
2: interface Orange {}
3: class Gala implements Apple {}
4: class Tangerine implements Orange {}
5: final class Citrus extends Tangerine {}
6: public class FruitStand {
7:      public static void main(String... farm) {
8:          Gala g = new Gala();
9:          Tangerine t = new Tangerine();
10:         Citrus c = new Citrus();
11:         System.out.print(t instanceof Gala);
12:         System.out.print(c instanceof Tangerine);
13:         System.out.print(g instanceof Apple);
14:         System.out.print(t instanceof Apple);
15:         System.out.print(c instanceof Apple);
16: } }

A. Line 11 contains a compiler error
B. Line 12 contains a compiler error
C. Line 13 contains a compiler error
D. Line 14 contains a compiler error
E. Line 15 contains a compiler error
F. None of the above

Answer: A, D, 15

13. What is the output of the following code?

1: interface Jump {
2:      static public int MAX = 3;
3: }
4: public abstract class Whale implments Jump {
5:      public abstract void dive();
6:      public static void main(String[] args) {
7:          Whale whale = new Orca();
8:          whale.dive(3);
9:      }
10: }
11: class Orca extends Whale {
12:     public void dive() {
13:         System.out.println("Orca diving");
14:     }
15:     public void dive(int... depth) {
16:         System.out.println("Orca diving deeper " + MAX);
17: } }

A. Orca diving
B. Orca diving deeper 3
C. The code will not compile because of line 2.
D. The code will not compile because of line 4.
E. The code will not compile because of line 11.
F. The code will not compile because of line 16.
G. None of the above.

Answer: B

14. Which statements are true for both abstract classes and interfaces? (Choose all that apply.)
A. Both can be extended using the extends keyword.
B. All methods within them are asssumed to be abstract.
C. Both can contain public static final variables.
D. The compiler will insert the implicit abstract modifier automatically on methods
declared without a body, if they are not marked as such.
E. Both interfaces and abstract classes can be declared with the abstract modifier.
F. both inherit java.lang.Object.

Answer: B, D, E, F

15. What is the result of the following code?

1: abstract class bird {
2:      private final void fly() {
3:      protected Bird() { System.out.println("Wow-"); }
4: }
5: public class Pelican extends Bird {
6:      public Pelican() { System.out.println("Oh-"); }
7:      protected void fly() { System.out.println("Pelican"); }
8:      public static void main(String[] args) {
9:          var chirp = new Pelican();
10:         chirp.fly();
11: } }

A. Oh-Bird
B. Oh-Pelican
C. Wow-Oh-Bird
D. Wow-Oh-Pelican
E. The code contains a compilation error.
F. None of the above.

Answer: E

16. Which of the following statements about this program is correct?

1: interface Aquatic {
2:      int getNumberOfGills(int p);
3: }
4: public class ClownFish implements Aquatic {
5:      String getNumOfGills() { return "14"; }
6:      int getNumOfGills(int input) { return 15; }
7:      public static void main(String[] args) {
8:          System.out.println(new ClownFish().getNumOfGills(-1));
9: } }

A. It compiles and prints 14.
B. It compiles and prints 15.
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of line 6.
F. None of the above.

Answer: C

17. Which statements about top-level types and member inner classes are correct? (Choose all that apply.)
A. A member inner class can be marked final.
B. A top-level type can be marked protected.
C. A member inner class cannot be marked public since that would make it a top-level class.
D. A top-level type must be stored in a .java file with a name that matches the class name.
E. If a member inner class is marked private, then it can be referenced only in the outer
class for which it is defined.

Answer:  A, D, E

18. What types can be inserted in the blanks on the lines marked X and Z that allow the code to compile?
(Choose all that apply.)

interface Walk { public List move(); }
interface Run extends Walk { public ArrayList move(); }
public class Leopard {
    public ______ move() { // X
        return null;
    }
}
public class Panther implements Run {
    public ______ move() { // Z
        return null;
    }
}

A. Integer on the line marked X
B. ArrayList on the line marked X
C. List on the line marked Z
D. ArrayList on the line marked Z
E. None of the above, since the Run interface does not compile.
F. The code does not compile for a different reason.

Answer: E

19. Which statements about interfaces are correct? (Choose all that apply.)
A. A class cannot extend multiple interfaces.
B. Java enables true multiple inheritance via interfaces.
C. Interfaces cannot be declared abstract.
D. If an interface does not contain a constructor, the compiler will insert one
automatically.
E. An interface can extend multiple interfaces.
F. An interface cannot be instantiated.

Answer: D, E, F

20. Which of the following classes and interfaces are correct and compile? (Choose all that apply.)

abstract class Camel {
    void travel();
}
interface EatsGrass {
    protected int chew();
}
abstract class Elephant {
    abstract private class SleepsAlot  {
        abstract int sleep();
    }
}
class Eagle {
    abstract soar();
}

A. SleepsAlot
B. Eagle
C. Camel
D. Elephant
E. EatsGrass
F. None of the classes or interfaces compile.

Answer: F

