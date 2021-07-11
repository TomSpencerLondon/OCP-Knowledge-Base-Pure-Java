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

3. Which of the following is true about a concrete class? (Choose all that apply.)
A. A concrete class can be declared as abstract.
B. A concrete class can implement all inherited abstract methods.
C. A concrete class can be marked as final.
D. If a concrete class inherits an interface from one of its superclasses, then it
must declare an implementation for all methods defined in that interface.
E. A concrete method that implements an abstract method must match the method declaration of the
abstract method exactly.

Answer: B, C, D

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

5. What modifiers are implicitly applied to all interface variables? (Choose all that apply.)
A. private
B. nonstatic
C. final
D. const
E. abstract
F. public
G. default (package-private)

Answer: C, F

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