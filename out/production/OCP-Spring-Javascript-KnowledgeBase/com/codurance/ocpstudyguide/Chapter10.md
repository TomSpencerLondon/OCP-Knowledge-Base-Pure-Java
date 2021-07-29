✅ means correct

❌ means incorrect


1. Which of the following statements are true? (Choose all that apply.)
A. Exceptions of type RuntimeException are unchecked.
B. Exceptions of type RuntimeException are checked.
C. You can declare unchecked exceptions.
D. You can declare checked exceptions.
E. You can handle only Exception subclasses.
F. All exceptions are subclasses of Throwable.

Answer: A, D, E, F
❌ Incorrect - correct answer was - A, C, D, F
- Exceptions of type Runtime 
- You can declare unchecked exceptions
- You can declare checked exceptions
- You CANNOT handle only Exception subclasses.
- All exceptions are subclasses of Throwable.

2. Which of the following pairs fill in the blanks to make
this code compile? (Choose all that apply.)

6: public void ohNo(ArithmeticException ae) _____ Exception {
7:      if ( ae == null) __________ Exception();   
8:      else _________ ae;
9: }

A. On line 6, fill in throw
B. On line 6, fill in throws
C. On line 7, fill in throw
D. On line 7, fill in throw new
E. On line 8, fill in throw
F. On line 8, fill in throw new
G. None of the above

Answer: B, D, E

3. What is printed by the following? (Choose all that apply.)

1: public class Mouse {
2:      public String name;
3:      public void findCheese() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              name.toString();
8:              System.out.print("3");
9:          } catch (NullPointerException e | ClassCastException e) {
10:             System.out.print("4");
11:             throw e;
12:         }
13:         System.out.print("5");
14:     }
15: public static void main(String... tom) {
16:     Mouse jerry = new Mouse();
17:     jerry.findCheese();
18: } }
✅ means correct

❌ means incorrect


1. Which of the following statements are true? (Choose all that apply.)
A. Exceptions of type RuntimeException are unchecked.
B. Exceptions of type RuntimeException are checked.
C. You can declare unchecked exceptions.
D. You can declare checked exceptions.
E. You can handle only Exception subclasses.
F. All exceptions are subclasses of Throwable.

Answer: A, D, E, F

2. Which of the following pairs fill in the blanks to make
this code compile? (Choose all that apply.)

6: public void ohNo(ArithmeticException ae) _____ Exception {
7:      if ( ae == null) __________ Exception();   
8:      else _________ ae;
9: }

A. On line 6, fill in throw
B. On line 6, fill in throws
C. On line 7, fill in throw
D. On line 7, fill in throw new
E. On line 8, fill in throw
F. On line 8, fill in throw new
G. None of the above

Answer: B, D, E

3. What is printed by the following? (Choose all that apply.)

1: public class Mouse {
2:      public String name;
3:      public void findCheese() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              name.toString();
8:              System.out.print("3");
9:          } catch (NullPointerException e | ClassCastException e) {
10:             System.out.print("4");
11:             throw e;
12:         }
13:         System.out.print("5");
14:     }
15: public static void main(String... tom) {
16:     Mouse jerry = new Mouse();
17:     jerry.findCheese();
18: } }

A. 1
B. 2
C. 3
D. 4
E. 5
F. The stack trace for a NullPointerException
G. None of the above

Answer: G

4. Which of the following statements about finally blocks are true? (Choose all that apply.)
A. A finally block is never required with a regular try statement.
B. A finally block is required when there are no catch blocks in a regular try statement.
C. A finally block is required when the program code doesn't terminate on its own.
D. A finally block is never required with a try-with-resources statement.
E. A finally block is required when there are no catch blocks in a try-with-resources statement.
F. A finally block is required in order to make sure all resources are closed in a try-with-resources statement.
G. A finally block is executed before the resources declared in a try-with-resources statement are closed.

Answer: D,  
A. 1
B. 2
C. 3
D. 4
E. 5
F. The stack trace for a NullPointerException
G. None of the above

Answer: G

4. Which of the following statements about finally blocks are true? (Choose all that apply.)
A. A finally block is never required with a regular try statement.
B. A finally block is required when there are no catch blocks in a regular try statement.
C. A finally block is required when the program code doesn't terminate on its own.
D. A finally block is never required with a try-with-resources statement.
E. A finally block is required when there are no catch blocks in a try-with-resources statement.
F. A finally block is required in order to make sure all resources are closed in a try-with-resources statement.
G. A finally block is executed before the resources declared in a try-with-resources statement are closed.

Answer: B, C, D

5. Which exception will the following method throw?

3: public static void main(String[] args) {
4:      Object obj = Integer.valueOf(3);
5:      String str = (String) obj;
6:      obj = null;
7:      System.out.println(obj.equals(null));
8: }

A. ArrayIndexOutOfBoundsException
B. IllegalArgumentException
C. ClassCastException
D. NumberFormatException
E. NullPointerException
F. None of the above

Answer: E

6. Which does the following method print?

11: public void tryAgain(String s) {
12:     try(FileReader r = null, p = new FileReader("")){
13:         System.out.print("X");
14:         throw new IllegalArgumentException();
15:     } catch (Exception s) {
16:         System.out.print("A");
17:     } finally {
18:         System.out.print("0");
19:     }
20: }

A. XAO 
B. XOA
C. One line of this method contains a compiler error.
D. Two lines of this method contain compiler errors.
E. Three lines of this method contain compiler errors.
F. The code compiles, but a NullPointerException is thrown at runtime.
G. None of the above.

Answer: C

7. What will happen if you add the following statement to a working main() method?
System.out.print(4 / 0);

A. It will not compile;
B. It will not run;
C. It will run and throw an ArithmeticException.
D. It will run and throw an IllegalArgumentException.
E. None of the above.

Answer: C

8. What is printed by the following program?

1: public class DoSomething {
2:      public void go() {
3:          System.out.print("A");
4:          try {
5:              stop();
6:          } catch (ArithmeticException e) {
7:              System.out.print("B");
8:          } finally {
9:              System.out.print("C");
10:         }
11:         System.out.print("D");
12:     }
13:     public void stop() {
14:         System.out.print("E");
15:         Object x = null;
16:         x.toString();
17:         System.out.print("F");
18:     }
19:     public static void main(String n[]){
20:         new DoSomething().go();
21:     }
22: }

A. AE
B. AEBCD
C. AEC
D. AECD
E. AE followed by a stack trace.
F. AEBCD followed by a stack trace.
G. AEC followed by a stack trace.
H. A stack trace with no other output.

Answer: D

9. What is the output of the following snippet, assuming a and b are both 0?

3: try {
4:      System.out.print( a / b);
5: } catch (RuntimeException e) {
6:      System.out.print(-1);
7: } catch (ArithmeticException e) {
8:      System.out.print(0);
9: } finally {
10:     System.out.print("done");
11: }

A. -1
B. 0
C. done-1
D. done0
E. The code does not compile
F. An uncaughtException is thrown
G. none of the above.

Answer: D

10. What is the output of the following program?

1: public class Laptop {
2:      public void start() {
3:          try {
4:              System.out.print("Starting up_");
5:              throw new Exception();
6:          } catch (Exception e) {
7:              System.out.print("Problem_");
8:              System.exit(0);
9:          } finally {
10:             System.out.print("Shutting down");
11:         }
12:     }
13:     public static void main(String[] w) {
14:         new Laptop().start();
15:     } }

A. Starting up_
B. Starting up_Problem_
C. Starting up_Problem_Shutting down
D. Starting up_Shutting down
E. The code does not compile.
F. An uncaught exception is thrown.

Answer: B

11. What is the output of the following program?

1: public class Dog {
2:      public String name;
3:      public void runAway() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              int x = Integer.parseInt(name);
8:              System.out.print("3");
9:          } catch (NumberFormatException e) {
10:             System.out.print("4");
11:         }
12:     }
13:     public static void main(String... args) {
14:         Dog webby = new Dog();
15:         webby.name = "webby";
16:         webby.runAway();
17:         System.out.print("5");
18:     } }

A. 1234
B. 1235
C. 124
D. 1245
E. The code does not compile.
F. An uncaught exception is thrown.
G. None of the above

Answer: D

12. What is the output of the following program?

1: public class Cat {
2:      public String name;
3:      public void knockStuffOver() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              int x = Integer.parseInt(name);
8:              System.out.print("3");
9:          } catch (NullPointerException e) {
10:             System.out.print("4");
11:         }
12:         System.out.print("5");
13: }
14: public static void main(String args[]) {
15:     Cat loki = new Cat();
16:     loki.name = "Loki";
17:     loki.knockStuffOver();
18:     System.out.print("6");
19: } }

A. The output is 12, followed by a stack trace for a NumberFormatException
B. The output is 124, followed by a stack trace for a NumberFormatException
C. The output is 12456
D. The output is 1256, followed by a stack trace for a NumberFormatException.
E. The code does not compile.
F. An uncaught exception is thrown.
G. None of the above.

Answer: A

13. Which of the following statements are true? (Choose all that apply.)

A. You can declare a method with Exception as the return type.
B. You can declare a method with RuntimeException as the return type.
C. You can declare any subclass of Error in the throws part of a method declaration
D. You can declare any subclass of Exception in the throws part of a method declaration.
E. You can declare any subclass of Object in the throws part of a method declaration.
F. You can declare any subclass of RuntimeException in the throws part of a method declaration.

Answer: E, F

14. Which of the following can be inserted on line 8 to make this code compile? (Choose all that apply.)

7: public void whatHappensNext() throws IOException {
8:      // INSERT CODE HERE
9: }

A. System.out.println("it's ok");
B. throw new Exception();
C. throw new IllegalArgumentException();
D. throw new java.io.IOException();
E. throw new RuntimeException();
F. None of the above.

Answer: D

15. What is printed by the following program (Choose all that apply.)

1: public class Help {
2:      public void callSuperHero() {
3:          try (String raspberry = new String("Olivia")) {
4:              System.out.print("Q"); 
5:          } catch (Error e) {
6:              System.out.print("X");
7:          } finally {
8:              System.out.print("M");
9:          }
10:     }
11:     public static void main(String[] args) {
12:         new Help().callSuperHero();
13:         System.out.print("S");
14:     } }

A. SQM
B. QXMS
C. QSM
D. QMS
E. A stack trace
F. The code does not compile because the NumberFormatException is not declared or caught.
G. None of the above.

Answer: D

16. Which of the following do not need to be handled or declared? (Choose all that apply.)
A. ArrayIndexOutOfBoundsException
B. IllegalArgumentException
C. IOException
D. Error
E. NumberFormatException
F. Any exception that extends RuntimeException
G. Any exception that extends Exception

Answer: A, B, F

17. Which lines can fill in the blank to make the following code compile? (Choose all that apply.)

void rollOut() throws ClassCastException {}

    public void transform(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | ______________) {
    }
}

A. IOException a
B. Error b
C. NullPointerException c
D. RuntimeException d
E. NumberFormatException e
F. ClassCastException f
G. None of the above. The code contains a compiler error regardless of what is inserted
into the blank.

Answer: G

18. Which scenario is the best use of an exception?
A. An element is not found when searching a list.
B. An unexpected parameter is passed into a method.
C. The computer caught fire.
D. You want to loop through a list.
E. You don't know how to code a method.

Answer: B

19. Which of the following can be inserted into Lion to make this code compile?
(Choose all that apply.)

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
    void roar() throws HasSoreThroatException;
}

class Lion implements Roar {
    // INSERT CODE HERE
}

A. public void roar() {}
B. public int roar() throws RuntimeException {}
C. public void roar() throws Exception {}
D. public void roar() throws HasSoreThroatException {}
E. public void roar() throws IllegalArgumentException {}
F. public void roar() throws TiredException {}

Answer: C, D

20. Which of the following are true? (Choose all that apply.)
A. Checked exceptions are allowed but not required, to be handled or declared.
B. Checked exceptions are required to be handled or declared.
C. Errors are allowed but not required, to be handled or declared.
D. Errors are required to be handled or declared.
E. Unchecked exceptions are allowed but not required to be handled or declared.
F. Unchecked exceptions are required to be handled or declared.

Answer: B, D, E.

21. Which of the following pairs fill in the blanks to make this code compile?
(Choose all that apply.)

6: public void ohNo(IOException ie) _______ Exception {
7:      ___________ FileNotFoundException();
8:      ___________ ie;
9: }

A. On line 6, fill in throw
B. On line 6, fill in throws
C. On line 7, fill in throw




















