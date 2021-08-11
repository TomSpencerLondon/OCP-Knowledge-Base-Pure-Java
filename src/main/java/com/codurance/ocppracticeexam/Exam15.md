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

11. What will the following code print?
    char[] a = {'h', 'e', 'l', 'l' };
    char[] b = { };
    
    int x = Arrays.compare(a, b);
    int y = Arrays.mismatch(a, b);
    System.out.println(x + " " + y);

A. It will throw an IndexOutOfBoundsException at run time.
B. 4 0
C. 1 0
D. -4 -4
E. -4 4

Answer: 4 0 - array on left has 4 lexicographic characters more than the 
array on the right.

12. What can be inserted at line 2 in the code snippet given below?

String[] names = {"Alex", "Bob", "Charlie" };
// Insert code here
System.out.println(list.get(0));

A. List<?> list = new ArrayList<>(Arrays.asList(names));
B. List<String> list = new ArrayList<>(Arrays.asList(names));
C. List<?> list = new ArrayList<?>(Arrays.asList(names));
D. List<> list = new ArrayList<String>(Arrays.asList(names));

Answer: A, B 

13. How can you initialize a StringBuilder to have a capacity of at least 100 characters?
Please select 2 options

A. StringBuilder sb = new StringBuilder(100);
B. StringBuilder sb = StringBuilder.getInstance(100);
C. StringBuilder sb = new StringBuilder();
sb.setCapacity(100);
d. StringBuilder sb = new StringBuilder();
sb.ensureCapacity;

Answer: A, C

14. What will happen on running the following program?

public class DatabaseWrapper
{
    static String url = "jdbc://derby://localhost:1527//mydb";
    static DatabaseWrapper getDatabase()
    {
        System.out.println("Getting DB");
        return null;
    }
    public static void main(String[] args)
    {
        System.out.println( getDatabase().url );
    }
}

A. it will print Getting DB and jdbc://derby//localhost:1527//mydb without throwing an exception
B. It will throw a NullPointerException at Runtime.
C. It will print jdbc://derby://locahost:1527//mydb but will NOT print Getting DB.
D. It will print Getting DB and then throw a NullPointerException.
E. It will print nothing.

Answer: A

15. What will the following code print when compiled and run?

var numA = new Integer[]{1, 2};
var list1 = List.of(numA);
numA[0] = 2;
var list2 = List.copyOf(list1);
System.out.println(list1 + " " + list2);

A. It will not compile.
B. [1, 2] [1, 2]
C. [2, 2] [1, 2]
D. [2, 2] [2, 2]

Answer:  B

16. Given the following set of member declarations, which of the following
is true?

int a; // (1)
static int a; // (2)
int f( ) { return a; } // (3)
static int f( ) { return a; } // (4)

A. Declarations (1) and (3) cannot occur in the same class definition. 
B. Declarations (2) and (4) cannot occur in the same class definition. 
C. Declarations (1) and (4) cannot occur in the same class definition. 
D. Declarations (2) and (3) cannot occur in the same class definition. 
E. Declarations (1) and (2) cannot occur in the same class definition. 

Answer: A, C

17. Complete the following code by inserting declaration for stateCitiesMap:
// Insert line of code here

// Insert line of code here


List<String> cities = new ArrayList<>();
cities.add("New York");
cities.add("Albany");
stateCitiesMap.put("NY", cities);

Select 2 options
A. Map<String, ArrayList<String>> stateCitiesMap = new HashMap<>();
B. Map<String, List<String>> stateCitiesMap = new HashMap<String, List<>>();
C. Map<String, ArrayList<String>> stateCitiesMap = new HashMap<<>, List<>>();
D. Map<String, List<String>> stateCitiesMap = new HashMap<String, ArrayList<String>>();
E. Map<String, List<String>> stateCitiesMap = new HashMap<>();
F. Map<String, List<String>> stateCitiesMap = new HashMap<String, List<String>>();

Answer: E, F

18. Given:
Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
Stream<String> firstNames = // INSERT CODE HERE

Which of the following options will correctly assign a stream fo just first names to firstNames?
Please select 1 option

A. names.map(e -> e.split(" ")[0]);
B. names.reduce(e -> e.split(" ")[0]);
C. names.filter(e -> e.split(" ")[0]);
D. names.forEach(e -> e.split(" ")[0]);

Answer: A

19. What will the following code fragment print when compiled and run?
Locale myloc = new Locale.Builder().setLanguage("hinglish").setRegion("IN").build(); // L1
ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);

Enumeration<String> en = msgs.getKeys();
while(en.hasMoreElements()){
    String key = en.nextElement();
    String val = msgs.getString(key);
    System.out.println(key+"="+val);
}

Assume that only the following two properties files (contents of the file is shown below the name of the file)
are accessible to the code.

1. mymsgs_hinglish_US.properties
okLabel=OK
cancelLabel=Cancel

2. mymsgs_hinglish_UK.properties
okLabel=YES
noLabel=NO

Please select 1 option
A. It will not compile due ot line L1.
B. It will not print anything.
C. okLabel=OK
cancelLabel=Cancel
D. okLabel=YES
noLabel=NO
E. It will throw an exception at run time.

Answer: E

20. What can be inserted at // 2 so that 6 will be printed by the following code?
AtomicInteger ai = new AtomicInteger(5);
// 2 INSERT CODE HERE
System.out.println(x);

Please select 2 options
A. int x = ai.increment();
B. int x = ai.getAndIncrement();
C. int x = ai + 1;
D. int x = ai.incrementAndGet();
E. int x = ai.addAndGet(1);
F. int x = ai.getAndSet(6);

Answer: D, E

21. Which of the following statements are correct regarding confidential information?
Please select 3 options

A. Confidential information should not be dumped into exception stack traces and log messages.
B. User input should be treated as confidential and kept encrypted in all components except where it is actually used.
C. Confidential data should be readable only within a limited context.
D. Sensitive information should be purged from memory after use.

Answer: A, B, C

22. Assume the following declarations:

class A { }
class B extends A { }
class C extends B { }

class X {
    B getB() { return new B(); }
}

class Y extends X {
    // method declaration here
}

Which of the following methods can be inserted in class Y?
Please select 2 options
A. public C getB() { return new B(); }
B. protected B getB(){ return new C(); }
C. C getB() { return new C(); }
D. A getB { return new A(); }

Answer: B, C

23.

import java.io.*;
class TestClass {
    public static void main(String[] args) throws Exception {
        try(var bfr = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter Number:");
            var s = bfr.readLine();
            System.out.println("Your Number is : " + s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

What will be the output if the above code is executed using the following command:
java TestClass 123

Please select 1 option
A. Enter Number:
(Program is stuck after printing the above)
B. Enter Number:
Your Number is:123
C. Enter Number:
Your Number is:TestClass 123
D. An exception stack trace will be printed.

Answer: B

Given:
class Base {
    public ArrayList<Number> transform(Set<Integer> list) {
        // valid code
    };
}

class Derived extends Base {
    *INSERT CODE HERE*
    // valid code
    }
}

What can be inserted in the above code?
Please select 1 option
A. public List<Number> transform(Set<Integer> list) {
B. public List<Integer> transform(Set<Integer> list) {
C. public ArrayList<? super Integer> transform(Set<Integer> list) {
D. public ArrayList<? extends Integer> transform(Set<Integer> list) {
E. public ArrayList<Number> transform(Set list) {

Answer: E - public ArrayList<Number> transform(Set<Integer> list) {

25. What happens when you try to compile and run the following program?

public class CastTest {
    public static void main(String[] args) {
        byte b = -128;
        int i = b;
        b = (byte) i;
        System.out.println(i + " " + b);
    }
}

Please select 1 option
A. The compiler will refuse to compile it because i and b are of different types cannot be assigned to each other.
B. The program will compile and print -128 and -128 when run .
C. The compiler will refuse to compile it because -128 is outside the range of values for a byte.
D. The program will compile and will print 128 and -128 when run .
E. The program will compile and will print 255 and -128 when run .

Answer: B

26. Given the following command:

javac --module-source-path c:\java\d -d c:\java\b -p c:\java\c -m x.y

Which of the following statements are correct?

A. A directory named out will be created under c:\java\b
B. A directory named x/y will be created under c:\java\b
C. A directory named x.y will be created under c:\java\c
D. Class files will be created under c:\java\b\x.y
E. Class files will be created under c:\java\a
F. This command is not valid because -classpath option is missing.

Answer: F.

27.
Consider:

class A { public void perform_work(){} }
class B extends A { public void perform_work() {} }
class C extends B { public void perform_work(){} }
How can you let perform_work() method of A to be called from an instance
method in C?

Please select 1 option
A. ((A) this).perform_work();
B. super.perform_work();
C. super.super.perform_work();
D. this.super.perform_work();
E. It is not possible

Answer: E - it is not possible

30. Identify examples of autoboxing.
Please select 3 options:
A. Long l = Long.valueOf(200)
B. Integer i = 10;
C. Integer getValue(){ return 2; }
D. Long getValue() { return 2; }
E. System.out.println(2+"");

Answer: B and C

31. Which of the following are valid implementations of java.lang.Comparable?
Please select 1 option:
A. var cin = new Comparable<Integer>() {
    public int compareTo(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }
};

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

