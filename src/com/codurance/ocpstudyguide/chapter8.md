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

✅ Correct Answer yay! - 

2. Which of the following statements about methods are true? (Choose all that apply.)
A. Overloaded methods must have the same signature.
B. Overridden methods must have the same signature.
C. Hidden methods must have the same signature.
D. Overloaded methods must have the same return type.
E. Overridden methods must have the same return type.
F. Hidden methods must have the same return type.

Answer: B, C, D, E, F

❌ - Incorrect answer - B, C - overridden methods must have ssame signature and - not of the methods
must have the same return type.

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

❌ - Incorrect answer - F - There is no default constructor - the constructor needs to
call super(int)

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
❌ Incorrect answer - E - super.numSpots = numSpots

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

❌ - Incorrect answer - A - SpiderSpiderArthropod - printName is overridden in the Spider
class and since there is no long param in a function in the Spider class the class uses the
Arthropod to fulfill this request.

  
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

13. Which of these classes will compile and will include a default constructor created by the compiler?
(Choose all that apply.)
A. public class Bird {}
B. public class Bird {
    public Bird() {}
}
C. public class Bird {
    public bird(String name) {}
}
D. public class Bird {
    public Bird() {}
}
E. public class Bird {
    Bird(String name) {}
}
F. public class Bird {
    private Bird(int age) {}
}
G. public class Bird {
    public Bird bird() { return null; }
}

Answer: A, G

14. Which of the following statements about inheritance are correct? (Choose all that apply.)
A. A class can directly extend any number of classes.
B. A class can implement any number of interfaces.
C. All variables inherit java.lang.Object.
D. If class A is extended by B, then B is a superclass of A.
E. If class C implements interface D, then C is subtype of D.
F. Multiple inheritance is the property of a class to have multiple direct superclasses.

Answer: B, E, F

15. What is the result of the following?

1: class Arachnid {
2:      static StringBuilder sb = new StringBuilder();
3:      { sb.append("c"); }
4:      static
5:      { sb.append("u"); }
6:      { sb.append("r"); }
7: }
8: public class Scorpion extends Arachnid {
9:      static
10:     { sb.append("q"); }
11:     { sb.append("m"); }
12:     public static void main(String[] args) {
13:         System.out.print(Scorpion.sb + " ");
14:         System.out.print(Scorpion.sb + " ");
15:         new Arachnid();
16:         new Scorpion();
17:         System.out.print(Scorpion.sb);
18:     } }

A. qu qu qumrcrc
B. u u ucrcrm
C. uq uq uqmcrcr
D. uq uq uqcrcrm
E. qu qu qumcrcr
F. qu qu qucrcrm
G. The code does not compile

Answer: D

16. Which of the following methods are valid overrides of the friendly() method in the Llama class?
(Choose all that apply.)

import java.util.*;

public class Llama {
    void friendly(List<String> laugh, Iterable<Short> s) {}
}

A. void friendly(List<CharSequence> laugh, Iterable<Short> s) {}
B. void friendly(List<String> laugh, Iterable<Short> s) {}
C. void friendly(ArrayList<String> laugh, Iterable<Short> s) {} 
D. void friendly(List<String> laugh, Iterable<Integer> s) {}
E. void friendly(ArrayList<CharSequence> laugh, Object s) {}
F. void friendly(ArrayList<String> laugh, Iterable... s) {}

Answer: A, D

17. Which of the following statements about inheritance and variables are true? (Choose all that apply.)

A. Instance variables can be overridden in a subclass
B. If an instance variable is declared with the same name as an inherited variable, then the
type of the variable must be covariant
C. If an instance variable is declared with the same name as an inherited variable, then the
access modifier must be at least as accessible as the variable in the parent class.
D. If a variable is declared with the same name as an inherited static variable then it
must also be marked static.
E. The variable in the child class may not throw a checked exception that is new or broader than
the class of any exception thrown in the parent class variable.
F. None of the above.

Answer: A, B, C, D

18. Which of the following are true? (Choose all that apply.)
A. this() can be called from anywhere in a constructor.
B. this() can be called from anywhere in an instance method.
C. this.variableName can be called from any instance method in the class.
D. this.variableName can be called from any static method in the class.
E. You can call the default constructor written by the compiler using this()
F. You can access a private constructor with the main() method in the same class.

Answer: C, E

19. Which statements about the following classes are correct? (Choose all that apply.)

1: public class Mammal {
2:      private void eat() {}
3:      protected static void drink() {}
4:      public Integer dance(String p) { return null; }
5: }
6: class Primate extends Mammal {
7:      public void eat(String p) {}
8: }
9: class Monkey extends Primate {
10:     public static void drink() throws RuntimeException() {}
11:     public Number dance(CharSequence p) { return null; }
12:     public int eat(String p) {}
13: }

A. The eat() method in Mammal is correctly overridden on line 7.
B. The eat() method in Mammal is correctly overloaded on line 7.
C. The drink() method in Mammal is correctly hidden in line 10.
D. The dance() method in Mammal is correctly overridden on line 11.
E. The dance() method in Mammal is correctly overloaded on line 11.
F. The eat() method in Primate is correctly hidden on line 12.
G. The eat() method in Primate is correctly overloaded on line 12.

Answer: B, C, D
 
20. What is the output of the following code?

1: class Reptile {
2:      { System.out.print("A"); }
3:      public Reptile(int hatch) {}
4:      void layEggs() {
5:          System.out.print("Reptile");
6:      } }
7: public class Lizard extends Reptile {
8:      static { System.out.print("B"); }
9:      public Lizard(int hatch) {}
10:     public final void layEggs() {
11:         System.out.print("Lizard");
12:     }
13:     public static void main(String[] args) {
14:         Reptile reptile = new Lizard(1);
15:         reptile.layEggs();
16:     } }

A. AALizard
B. BALizard
C. BLizardA
D. ALizard
E. The code will not compile because of line 10.
F. None of the above.

Answer: B

21. Which statement about the following program is correct?

1: class Bird {
2:      int feathers = 0;
3:      Bird(int x) { this.feathers = x; }
4:      Bird fly() {
5:          return new Bird(1);
6:      } }
7: class Parrot extends Bird {
8:      protected Parrot (int y) { super(y); }
9:      protected Parrot fly() {
10:         return new Parrot(2);
11:     } }
12: public class Macaw extends Parrot {
13:     public Macaw(int z) { super(z); }
14:     public Macaw fly() {
15:         return new Macaw(3);
16:     }
17:     public static void main(String... sing) {
18:         Bird p = new Macaw(4);
19:         System.out.print(((Parrot) p.fly()).feathers);
20:     } }

A. One line contains a compiler error. 
B. Two lines contain compiler errors.
C. Three lines contain compiler errors.
D. The code compiles but throws a ClassCastException at runtime.
E. The program compiles and prints 3.
F. The program compiles and prints 0.

Answer: B

22. What does the following program print?
1: class Person {
2:      static String name;
3:      void setName(String q) { name = q; } }
4: public class Child extends Person {
5:      static String name;
6:      void setName(String w) { name = w; }
7:      public static void main(String[] p) {
8:          final Child m = new Child();
9:          final Person t = m;
10:         m.name = "Elysia";
11:         t.name = "Sophia";
12:         m.setName("Webby");
13:         t.setName("Olivia");
14:         System.out.println(m.name + " " + t.name);
15: } }

A. Elysia Sophia
B. Webby Olivia
C. Olivia Olivia
D. Olivia Sophia
E. The code does not compile.
F. None of the above

Answer: B

23. What is the output of the following program?
1: class Canine {
2:      public Canine(boolean t) { logger.append("a"); }
3:      public Canine() { logger.append("q"); }
4:
5:      private StringBuilder logger = new StringBuilder();
6:      protected void print(String v) { logger.append(v); }
7:      protected String view() { return logger.toString(); }
8: }
9:
10: class Fox extends Canine {
11:     public Fox(long x) { print("q"); }
12:     public Fox(String name) {
13:         this(2);
14:         print("z");
15:     }
16: }
17:
18: public Fennec extends Fox {
19:     public Fennec(int e) {
20:         super("tails");
21:         print("j");
22:     }
23:     public Fennec(short f) {
24:         super("eevee");
25:         print("m");
26:     }
27:
28:     public static void main(String... unused) {
29:         System.out.println(new Fennec(1).view());
30:     } }

A. qpz
B. qpzj
C. jzpa
D. apj
E. apjm
F. The code does not compile
G. None of the above

Answer: F

24. Which statements about polymorphism and method inheritance are correct? (Choose all that apply.)
A. It cannot be determined until runtime which overridden method will be executed in a parent class.
B. It cannot be determined until runtime which hidden method will be executed in a parent class.
C. Marking a method static prevents it from being overridden or hidden.
D. Marking a method final prevents it from being overridden or hidden.
E. The reference type of the variable determines which overridden method will be called at runtime.
F. The reference type of the variable determines which hidden method will be called at runtime.

Answer: A, D, E
 
25. What is printed by the following program?
1: class Antelope {
2:      public Antelope(int p) {
3:          System.out.print("4");
4:      }
5:      { System.out.print("2"); }
6:      static { System.out.print("1"); }
7: }
8: public class Gazelle extends Antelope {
9:      public Gazelle(int p) {
10:         super(6);
11:         System.out.print("3");
12:     }
13:     public static void main(String hopping[]) {
14:         new Gazelle(0);
15:     }
16:     static { System.out.print("8"); }
17:     { System.out.print("9"); }
18: }

A. 182640
B. 182943
C. 182493
D. 421389
E. The code does not compile
F. The output cannot be determined until runtime.

Answer: C

26. How many lines of the following program contain a compilation error?
1: class Primate {
2:      protected int age = 2;
3:      { age = 1; }
4:      public Primate() {
5:          this().age = 3;
6:      }
7: }
8: public class Orangutan {
9:      protected int age = 4;
10:     { age = 5 }
11:     public Orangutan() {
12:         this().age = 6;
13:     }
14:     public static void main(String[] bananas) {
15:         final Primate x = (Primate) new Orangutan();
16:         System.out.println(x.age);
17:     }
18: }

A. None, and the program prints 1 at runtime.
B. None, and the program prints 3 at runtime.
C. none but it causes a ClassCastException at runtime.
D. 1
E. 2
F. 3
G. 4

Answer: F