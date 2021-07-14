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

