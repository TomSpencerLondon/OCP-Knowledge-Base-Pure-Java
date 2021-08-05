##### Practice questions

Q1. Which of the following implementations of a max() method will correctly return the largest value?
Please select 1 option:

A:

int max (int x, int y) {
    return ( if (x > y) { x; } else { y; } );
}

B:

int max (int x, int y) {
    return ( if (x > y) { return x; } else{ return y; });
}

C:

int max(int x, int y) {
    switch(x < y){
        case true:
            return y;
        default:
            return x;

D:

int max(int x, int y){
    var m = x > y?x : y;
    return m;
}

E:

int max(var x, var y) {
    if (x > y) return x;
    return y;
}

Answer: D

2. MOVE What is the result of compiling and running the following code?

public class TestClass {
    static int si = 10;
    public static void main (String args[]) {
        new TestClass();
    }
    public TestClass(){
        System.out.println(this);
    }
    public String toString() {
        return "TestClass.si = " + this.si;
    }
}

Please select 1 option:
A. The class will not compile because you cannot override toString() method.
B. The class will not compile as si being static, this.si is not a valid statement.
C. It will print TestClass@nnnnnnn, where nnnnnnn is the hash code of the TestClass object referred to by 'this'.
D. It will print TestClass.si = 10
E. None of the above

Answer: D

3:
Consider the following program...

class Super { }
class Sub extends Super { }
public class TestClass {
    public static void main(String[] args) {
        Super s1 = new Super();
        Sub s2 = new Sub();
        s1 = (Super) s2;
    }
}

Which of the following statements are correct?
Please select 1 option
A. It will compile and run without any problems
B. It will compile but WILL throw ClassCastException at runtime.
C. It will compile but MAY throw ClassCastException at runtime.
D. It will not compile.
E. None of the above.

Answer: A - A sub class can be cast to a Super class but not the other way round.

4:
What will be the result of compiling and running the following code?

class Base {
    public short getValue() { return 1; } // 1
}

class Base2 extends Base {
    public byte getValue() return 2; } // 2
}

public class TestClass {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.getValue()); // 3
    }
}

Please select 1 option
A. It will print 1
B. It will print 2
C. Compile time error at // 1
D. Compile time error at // 2
E. Compile time error at // 3

Answer: C - compile time error at // 1 - getValue() in Base2 has an incompatibile return
type as it is overriding short getValue() from Base.

5. 
Given the following code:

enum Title
{
    MR("Mr. "), MRS("Mrs. "), MS("Ms. ");
    
    private String title;
    private Title(String s) {
        title = s;
    }
    
    public String format(String first, String last) {
        return title+ " "+first+" "+last;
    }
}

Identify valid code snippets ... 
(Assume that Title is accessible wherever required)

Please select 4 options

A.
class TestClass {
    void someMethod()
    {
        System.out.println(Title.format("Rob", "Miller));
    }
}

B.
class TestClass {
    void someMethod()
    {
        System.out.println(Title.MR.format("Rob", "Miller"));
    }
}

C.
class TestClass {
    void someMethod()
    {
        System.out.println(MR.format("Rob", "Miller"));
    }
}

D.
enum Title2 extends Title
{
    DR("Dr. ");
}

E.
class TestClass {
    void someMethod()
    {
        Title.DR dr = new Title.DR("Dr. ");
    }
}

F.
enum Title2
{
    DR;
    private Title t = Title.MR;
}

G.
enum Title2
{
    DR;
    private Title t = Title.MR;
    public String format(String s){ return t.format(s, s); };
}

Answer: A, B, D, F

6. Which of the following options are guidelines to protect confidential information?
A. Confidential information should not be stored in the application
B. Confidential and other information should be treated uniformly
C. Access to confidential information should be limited.
D. Objects containing confidential information should be encapsulated properly.
E. Handle information transparently to improve diagnostics
F. Clearly identify and label confidential information

Answer: C, D, F

7. Which of the following methods are available in java.io.Console?
A. readPassword
B. reader
C. writer
D. readLine
E. read
F. getPassword
G. format

flush() flushes the console and forces buffered output to be written immediately
format(String fmt, Object... args) writes formatted string to the console's output stream using format string and arguments
printf(String format, Object... args) A convenience method to write a formatted string to this console's output stream.
reader() retrieves the unique Reader object associated with the console
readLine() reads a single line of text from the console
readPassword() reads a password or passphrase from the console with echoing disabled
readPassword(String fmt, Object... args) Provides a formatted prompt, then reads password or passphrase from the console
writer() retrieves the unique PrintWriter object associated with this console.

Answer: readPassword, reader, writer, readLine, format

8. Consider the following program...

class ArrayTest {
    public static void main(String[] args) {
        var ia[][] = { {1, 2}, null };
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(ia[i][j]);
            }
        }
    }
}

Which of the following statements are true?

A. It will throw an ArrayIndexOutOfBoundsException at Runtime.
B. It will throw a NullPointerException at Runtime.
C. It will compile and run without throwing any exception.
D. It will compile and throw a NullPointerException at runtime if var ia[][] = { {1, 2}, null}; is replaced with var
ia = new int[][]{ {1, 2}, null};
E. It will compile and throw a NullPointerException at runtime if var ia[][] = { {1, 2 }, null }; is replaced with
var ia[][] = new int[][]{ {1, 2}, null };

Answer: D

9. Given:
String qr = "insert into USERINFO values ( ?, ?, ?)";
try (PreparedStatement ps = c.prepareStatement(qr);)
{
    ps.setObject(0, 1) // 1
    ps.setObject(1, "Ally A", JDBCType.VARCHAR) // 2
    ps.setObject(2, "101 main str"); // 3
    ps.executeUpdate(); // 4
    ps.setObject(1, "Bob B"); // 5
    ps.setNull(2, java.sql.Types.VARCHAR) // 6
    ps.executeUpdate() // 6
}

What will be the result?
Please select 1 option
A. Two rows with the following values will be inserted in teh USERINFO table:
1, Ally A, 101 main str
null Bob B, null

B. Two rows with the following values will be inserted in the USERINFO table:
1, Ally A, 101 main str
1, Bob B, 101 main str 

C. An exception will be thrown at //1.
D. An exception will be thrown at //2.
E. An exception will be thrown at //3.
F. An exception will be thrown at //4.
G. An exception will be thrown at //5.
H. An exception will be thrown at //6.

Answer: H - an exception will be thrown at line //6.

10. What will the following code print when compiled and run?

interface Eatable {
    int types = 10;
}

class Food implements Eatable {
    public static int types = 20;
}

public class Fruit extends Food implements Eatable { // LINE1

    public static void main(String[] args) {
        types = 38; // LINE2
        System.out.println(types); // LINE 3
    }
}

Please select 1 option
A. Compilation failure at // LINE 1    
B. Compilation failure at // LINE 2
C. Compilation failure at // LINE 3
D. 10
E. 20
F. 30
G. Compilation failure at // LINE2 as well as at // LINE3

Answer: G compilation failure at LINE2 and LINE3









![Screenshot 2021-07-29 at 18 39 04](https://user-images.githubusercontent.com/27693622/127539393-349976a3-90a7-4129-96e5-9b81a3104abb.png)



![Screenshot 2021-07-29 at 18 38 56](https://user-images.githubusercontent.com/27693622/127539391-8f6d3d24-af37-4bd3-ab9a-a94cf8e2d62a.png)

![Screenshot 2021-07-29 at 18 32 33](https://user-images.githubusercontent.com/27693622/127539384-b3bce83c-f0a3-415f-861b-931e16205673.png)


![Screenshot 2021-07-29 at 18 38 52](https://user-images.githubusercontent.com/27693622/127539388-d53c8010-4e51-4a97-9012-bb993b4f07ae.png)

![Screenshot 2021-07-29 at 18 39 15](https://user-images.githubusercontent.com/27693622/127539396-16d147e8-31b7-404a-8ff1-9e01bb4dd808.png)


![Screenshot 2021-07-29 at 18 39 37](https://user-images.githubusercontent.com/27693622/127539373-3ff65fed-ab47-4b36-83bd-043de5f8ab41.png)

![Screenshot 2021-07-29 at 18 39 28](https://user-images.githubusercontent.com/27693622/127539398-40027e54-45aa-4324-b1cf-e50d7ef5a118.png)

#### Questions from Exam 16:
![Screenshot 2021-07-29 at 17 18 41](https://user-images.githubusercontent.com/27693622/127539377-a5378f58-b128-4380-ae4c-e44856e4de3b.png)

![Screenshot 2021-07-29 at 17 30 15](https://user-images.githubusercontent.com/27693622/127539379-31d1ff27-9b13-46c9-8d6c-c6dae631b61e.png)

#### Use java docs for answers:
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
>>>>>>> add:src/com/codurance/ocppracticeexam/README.md

