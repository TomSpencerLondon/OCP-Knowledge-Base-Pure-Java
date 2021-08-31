#### Exam 1

1. Consider the following code:

interface Flyer { String getName() }

class Bird implements Flyer {
    public String name;
    public Bird(String name) {
        this.name = name;
    }
    public String getName() { return name; }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");
        // PRINT NAME HERE;
    }
}

A. System.out.println(f.name);
B. System.out.println(f.getName());
C. System.out.println(((Eagle) f).name);
D. System.out.println(((Bird) f).getName());
E. System.out.println(Eagle.name);
F. System.out.println(Eagle.getName(f));

Answer: B, C, D

2. Given:
public class Book {
    private String title;
    private String genre;
    public Book(String title, String genre){
        this.title = title;
        this.genre = genre;
    }
    // accessors not shown   
}

and the following code:

List<Book> books = // code to create the list goes here

Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre()); // 1
books.stream().sorted(c1.thenComparing(Book::getTitle)); // 2
System.out.println(books);

A. It will print the list that is sorted by the genre and then sorted by title within.
B. It will print the list that is sorted by title and then sorted by genre within.
C. It will print the list as it is.
D. Code will fail to compile because of code at // 1.
E. Code will fail to compile because of code at // 2.

Answer: A. It will print the list that is sorted by the genre and then sorted by title within.

3.
What will be the result of attempting to compile and run the following class?

public class TestClass {
    public static void main(String args[]) {
        int i, j, k;
        i = j = k = 9;
        System.out.println(i);
    }
}

Please select 2 options
A. The code will not compile because unlike C++, operator '=' cannot be chained i.e a = b = c = d is invalid.
B. The code will not compile as 'j' is being used before getting initialized.
C. The code will compile correctly and will display '9' when run.
D. The code will not compile as 'j' and 'i' are being used before getting initialized.
E. All the variables will get a value of 9.

Answer: C - The code will compile correctly and will display '9' when run.

4. Given the following method code appearing in an application that manages files
on a server machine:

List<File> dir;
public <R> List<R> executeFunction(Function<File, R> fun){
    List<R> l = new ArrayList<R>();
    for (File f : dir){
        l.add(fun.apply(f));
    }
    return l;
}

/*
The caller of this method passes in a Function that takes a java.io.File object
and performs whatever operation is needed to be required that the above code
must ensure that the caller only reads a file and is not able to overwrite or delete
it irrespective of what level of permission the caller has. How can this
be done?
*/
Please select 1 option

A. Change the code inside the for loop as follows:

AccessController.doPrivileged(new PrivilegedAction<Void>()) {
    public Void run() {
        l.add(fun.apply(f));
        return null;
    }}
);

B. Change the code inside the for loop as follows:
Permission perm = new java.io.FilePermission(f.getPath(), "read");
PermissionCollection perms = perm.newPermissionCollection();
perms.add(perm);

AccessController.doPrivileged(new PriviligedAction<Void>(){
    public Void run() {
    }},
    new AccessControlContext(
        new ProtectionDomain[] {
            new ProtectionDomain(null, perms)
        }
    )
);

C. Change the code inside the for loop as follows:
    Permission perm = new java.io.FilePrmission(f.getPath(), "read");
    AccessController.doPrivileged(new PrivilegedAction<Void>(){
        public Void run() {
            l.add(fun.apply(f));
            return null;
        }
    });
    
D. No code change is required. Modify the policy file to have only read
permission to the given files.

Answer: B

5. What exception will be thrown out of the main method when the following program
is run?

package trywithresources;

import java.io.IOException;

public class Device implements AutoCloseable {
    String header = null;
    public void open() throws IOException {
        header = "OPENED";
        System.out.println("Device Opened");
        throw new IOException("Unknown");
    }
    
    public String read() throws IOException {
        return "";
    }
    
    public void close() {
        System.out.println("Closing device");
        header = null;
        throw new RuntimeException("rte");
    }
    
    public static void main(String[] args) throws Exception {
        try (Device d = new Device()) {
            throw new Exception("test");
        }
    }
}

Please select 1 option
A. java.lang.Exception
B. java.lang.RuntimeException
C. java.io.IOException
D. The given code will not compile.

Answer: C. java.io.IOException

6. What will the following code print when run?

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MarkTest {
    public static void main(String[] args) {
        try (Reader r = new BufferedReader(new FileReader("c:\\temp\\test.text"))) {
            if (r.markSupported()) {
                BufferedReader in = (BufferedReader) r;
                System.out.print(in.readLine());
                in.mark(100);
                System.out.print(in.readLine());
                System.out.print(in.readLine());
                in.reset();
                System.out.print(in.readLine());
                in.reset();
                System.out.println(in.readLine());
            } else {
                System.out.println("Mark not Supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Assume that the file test.txt contains:
A
B
C
D
E

Please select 1 option:
A. Mark Not Supported
B. ABCB <exception stack trace>
C. ABCBB
D. ABCBD

Answer: C - ABCBB

7. What changes can be made to the following code so that it will print:

Old Rating A
New Rating R

List<Character> ratings = Arrays.asList('U', 'R', 'A');
ratings.stream()
    .filter(x -> x == 'A') // 1
    .peek(x -> System.out.println("Old Rating " + x) // 2
    .map(x -> x == 'A' ? 'R' : x) // 3
    .peek(x -> System.out.println("New Rating " + x)); 

Please select 1 option:
A. Replace // 2 with .forEach(System.out::println)
B. Replace // 3 with .map(x -> System.out.println('R'));
and remove // 4
C. Replace // 4 with .forEach(x -> System.out.println("New Rating " + x))
D. No change is necessary

Answer: D - No change is necessary

8. Consider the following code:

public class SubClass extends SuperClass {
    int i, j, k;
    public SubClass(int m, int n) { i = m; j = m; } // 1
    public SubClass(int m) { super(m); } // 2
}

Which of the following constructors MUST exist in SuperClass for SubClass
to compile correctly?

Please select 2 options:
A. It is ok even if no explicit constructor is defined in SuperClass.
B. public SuperClass(int a, int b)
C. public SuperClass(int a)
D. public SuperClass()
E. Only public SuperClass(int a) is required.

Answer: C - public SuperClass(int a), D - public SuperClass()

9. Given:
// INSERT CODE HERE
    public abstract void draw();
}

// INSERT CODE HERE
    public void draw() { System.out.println("in draw..."); }
}

Which of the following lines of code can be used to complete the above
code?

Please select 2 options
A.
class Shape {
// and

class Circle extends Shape {

B.
public class Shape {
// and

class Circle extends Shape {

C.
abstract Shape {
// and

public class Circle extends Shape {

D.
public abstract class Shape {
// and

class Circle extends Shape {
    @Override

E.
public abstract class Shape {
// and

class Circle implements Shape {

F.
public interface Shape {
// and

class Circle implements Shape {
    @Override

Answer C, D - Abstract classes need to be extended whereas interfaces
should be implemented.

10. Which of the following expressions can be used to implement a
Function<Integer, String> ?
Please select 3 options

A. (a) -> Integer.toHexString(a) /
B. a -> Integer::toHexString /
C. Integer::toHexString
D. i::toHexString
E. toHexString
F. val -> val + 1
G.  (Integer a) -> Integer.toHexString(a) /
H. Integer a -> Integer.toHexString(a)

Answer: A, B, C
You can do:
A. Function<Integer, String> f = (a) -> Integer.toHexString(a);
B. Function<Integer, String> g = a -> Integer::toHexString;
C. Function<Integer, String> h = Integer::toHexString;

11. What will be the result of attempting to compile and run the following
code?

public class InitClass {
    public static void main(String args[]) {
        InitClass obj = new InitClass(5);
    }
    int m;
    static int i1 = 5;
    static int i2;
    int j = 100;
    int x;
    
    public InitClass(int m) {
        System.out.println(i1 + " " + i2 + "  " + x +
        " " + j + " " + m);
    }
    
    { j = 30; i2 = 40; } // Instance Initializer
    static { i1++; } // Static initializer
}

Please select 1 option:
A. The code will fail to compile since the instance initializer tries to
assign a value to a static member.
B. The code will fail to compile since the member variable x will be
uninitialized when it is used.
C. The code will compile without error and will print 6 40 0 30 5 when run.
D. The code will compile without error and will print 5, 0, 0, 100, 5 when run.
E. The code will compile without error and will print 5, 40, 0, 30, 0 when run.

Answer: C. The code will print 6 40 0 30 5 when run.

12.
Given:

Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); // 1
Stream<Integer> strm2 = strm1.filter(i -> { return i > 5 && i < 15; }); // 2
strm2.forEach(System.out::print); // 3

Which of the following options can be used to replace line at // 2 and still
print the same elements of the stream?

Please select 1 option

A. Stream<Integer> strm2 = strm1.filter(i>5).filter(i<15);
B. Stream<Integer> strm2 = strm1.parallel().filter(i -> i > 5).filter(i -> i < 15).sequential();
C. Stream<Integer> strm2 = strm1.collect(
    Collectors.partitioningBy(i -> { return i > 5 && i < 15; })
).get("true").stream();
D. Stream<Integer> strm2 = strm1.map(i -> i > 5 ? i < 15 ? i : null : null)

Answer: B.

13. Which of the following code fragments correctly loads a service
provider that implements api.BloggerService?

Please select 1 option
A. Iterable<api.BloggerService> bsLoader = ServiceLoader.load(api.BloggerService.class)
B. api.BloggerService bloggerServiceRef = ServiceLoader.load(api.BloggerService.class)
C. api.BloggerService bloggerServiceRef = ServiceLoader.load(api.BloggerService.class)
D. ServiceLoader<api.BloggerService> bsLoader = new ServiceLoader<>(api.BloggerService.class)
E. api.BloggerService bloggerServiceRef = java.util.service.Provider.getProvider(api.BloggerService.class);

Answer: A

14.
Identify the right declaration for 'box' for the following code.

import java.util.*;
class Dumper {
    // declaration for box
    Map<String, List<String>> box = new HashMap<String, List<String>>();
    public void dumpStuff(){
        for (List<String> l : box.values()) {
            System.out.println(l);
        }
    }
}

Please select 2 options:
A. List<String> box = new ArrayList<String>();
B. Map<List<String>> box = new TreeMap<List<String>>();
C. Map<String, List<String>> box = new HashMap<String, List<String>>();
D. LinkedList<String> box = new LinkedList<String>();
E. HashMap<?, List<String>> box = new HashMap<String, List<String>>();
F. HashMap<?, List<String>> box = new HashMap<?, List<String>>();

Answer: C, E.

15. What will the following class print when compiled and run?

class Holder {
    int value = 1;
    Holder link;
    public Holder(int val) { this.value = val; }
    public static void main(String[] args){
        final var a = new Holder(5);
        var b = new Holder(10);
        a.link = b;
        b.link = setIt(a, b);
        System.out.println(a.link.value+ " " + b.link.value);
    }
    
    public static Holder setIt(final Holder x, final Holder y) {
        x.link = y.link;
        return x;
    }
}


Please select 1 option:
A. It will not compile because 'a' is final
B. It will not compile because method setIt() cannot change x.link
C. It will print 5, 10
D. It will print 10, 10
E. It will throw an exception when run.

Answer: E. It will throw an exception when run.