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
G. None of the above.

Answer: B

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

9. Which access modifiers can be applied to member inner classes? (Choose all that apply.)
A. static
B. public
C. default (package-private)
D. final
E. protected
F. private

Answer: A, B, C, E, F

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

