1. Which code can be inserted to have the code print 2?

public class BirdSeed {
    private int numberBags;
    boolean call;
    
    public BirdSeed() {
        // LINE 1
        call = false;
        // LINE 2
    }
    
    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }
    
    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}

A. Replace Line 1 with BirdSeed(2);
B. Replace line 2 with BirdSeed(2);
C. Replace line 1 with new BirdSeed(2);
D. Replace line 2 with new BirdSeed(2);
E. replace line 1 with this(2);
F. Replace line 2 with this(2);
G. The code prints 2 without any changes.

Answer: E - replace line 1 with this(2);

2. Which of the following statements about methods are true? (Choose all that apply.)
A. Overloaded methods must have the same signature.
B. Overridden methods must have the same signature.
C. Hidden methods must have the same signature.
D. Overloaded methods must have the same return type.
E. Overridden methods must have the same return type.
F. Hidden methods must have the same return type.

Answer: B, C, D, E, F

3. What is the output of the following program?
1: class Mammal {
2:      private void sneeze() {}
3:      public Mammal (int age) {
4:          System.out.print("Mammal");
5:      } }
6: public class Platypus extends Mammal {
7:      int sneeze() { return 1; }
8:      public Platypus() {
9:          System.out.print("Platypus");
10:     }
11:     public static void main(String[] args) {
12:         new Mammal(5);
13:     } }

A. Platypus
B. Mammal
C. PlatypusMammal
D. MammalPlatypus
E. The code will compile if line 7 is changed.
F. The code will compile if line 9 is changed.

Answer: B

4. Which of the following complete the constructor so that this code prints out 50? (Choose all that apply.)

class Speedster {
    int numSpots;
}

public class Cheetah extends Speedster {
    int numSpots;
    
    public Cheetah(int numSpots) {
        // INSERT CODE HERE
    }
    
    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.print(s.numSpots);
    }
}

A. numSpots = numSpots;
B. numSpots = this.numSpots;
C. this.numSpots = numSpots;
D. numSpots = super.numSpots;
E. super.numSpots = numSpots;
F. The code does not compile, regardless of the code inserted into the constructor.
G. None of the above

Answer: G

5. What is the output of the following code?

1: class Arthropod {
2:      protected void printName(long input) {
3:          System.out.print("Arthropod")
4:      }
5:      void printName (int input) {
6:          System.out.print("Spooky");
7:      } }
8: public class Spider extends Arthropod {
9:      protected void printName (int input) {
10:         System.out.print("Spider");
11:     }
12:     public static void main(String[] args) {
13:         Arthropod a = new Spider();
14:         a.printName((short) 4);
15:         a.printName(4);
16:         a.printName(5L);
17:     } }

A. SpiderSpiderArthropod
B. SpiderSpiderSpider
C. SpiderSpookyArthropod
D. SpookySpiderArthropod
E. The code will not compile because of line 5.
F. the code will not compile because of line 9.
G. None of the above

Answer: D - SpookySpiderArthropod
  
6. Which of the following statements about overridden methods are true? (Choose all that apply.)

A. An overridden method must contain method parameters that are the same or covariant with 
the method parameters in the inherited method.
B. An overridden method may declare a new exception, provided it is not checked.
C. An overridden method must be more accessible than the method in the parent class.
D. An overridden method may declare a broader checked exception than the method in the
parent class.
E. If an inherited method returns void, then the overridden version of the method must
return void.
F. None of the above.

Answer: A, C, D, E

7. Which of the following pairs, when inserted into the blanks, allow the code to compile?
(Choose all that apply.)

1: public class Howler {
2:      public Howler (long shadow) {
3:          _______________;
4:      }
5:      private Howler (int moon) {
6:          super();
7:      }
8: }
9: class Wolf extends Howler {
10:     protected Wolf(String stars) {
11:         super(2L);
12:     }
13:     public Wolf() {
14:         ______________;
15:     }
16: }

A. this(3) at line 3, this("") at line 14
B. this() at line 3, super(1) at line 14
C. this((short) 1) at line 3, this(null) at line 14
D. super() at line 3, super() at line 14
E. this(2L) at line 3, super((short) 2) at line 14
F. this(5) at line 3, super(null) at line 14
G. Remove lines 3 and 14.

Answer: C, F

8. What is the result of the following?

1: public class PolarBear {
2:      StringBuilder value = new StringBuilder("t");
3:      { value.append("a"); }
4:      { value.append("c"); }
5:      private PolarBear() {
6:          value.append("b");
7:      }
8:      public PolarBear(String s) {
9:          this();
10:         value.append(s);
11:     }
12:     public PolarBear(CharSequence p) {
13:         value.append(p);
14:     }
15:     public static void main(String[] args) {
16:         Object bear = new PolarBear();
17:         bear = new PolarBear("f");
18:         System.out.println(((PolarBear)bear).value);
19:     } }

A. tacb
B. tacf
C. tacbf
D. tcafb
E. taftacb
F. The code does not compile
G. An exception is thrown.

Answer: C

9. Which of the following method signatures are valid overrides of the hairy() method in the
Alpaca class? (Choose all that apply.)

import java.util.*;

public class Alpaca {
    protected List<String> hairy(int p) { return null; }
}

A. List<String> hairy(int p) { return null; }
B. public List<String> hairy(int p) { return null; }
C. public List<CharSequence> hairy(int p) { return null; }
D. private List<String> hairy(int p) { return null; }
E. public Object hairy(int p) { return null; }
F. public ArrayList<String> hairy(int p) { return null; }
G. None of the above.

Answer: B, C, F

10. How many lines of the following program contain a compilation error?

1: public class Rodent {
2:      public Rodent(var x) {}
3:      protected static Integer chew() throws Exception {
4:          System.out.println("Rodent is chewing");
5:          return 1;
6:      }
7: }
8: class Beaver extends Rodent {
9:      public Number chew() throws RuntimeException {
10:         System.out.println("Beaver is chewing on wood");
11:         return 2;
12:     }
13: } }

A. None
B. 1
C. 2
D. 3
E. 4
F. 5

Answer: D - 3

11. which of the following statements about polymorphism are true? (Choose all that apply.)
A. An object may be cast to a subtype without an explicit cast.
B. If the type of a method argument is an interface, then a reference variable that implements the
interface may be passed to the method.
C. A method that takes a parameter with type java.lang.Object can be passed any variable.
D. All cast exceptions can be detected at compile-time.
E. By defining a final instance method in the superclass, you guarantee that the specific
method will be called in the parent class at runtime.
F. Polymorphism applies only to classes, not interfaces.

Answer: B, D, E

12. Which of the following statements can be inserted in the blank so that the code will
compile successfully? (Choose all that apply.)

public class Snake {}
public class Cobra extends Snake {}
public class Snakehandler {
    private Snake snake;
    public void setSnake(Snake snake) { this.snake = snake; }
    public static void main(String[] args) {
        new SnakeHandler().setSnake(__________);
    }    
}

A. new Cobra()
B. new Snake()
C. new Object()
D. new String("Snake")
E. new GardenSnake()
F. null
G. None of the above. The class do not compile regardless of the value
inserted in the blank.

Answer: G






