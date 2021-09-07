#### Exam 2

1. 
Given:

abstract class AmazingClass {
    void amazingMethod(Collection c){
        System.out.println("Got collection");
    };
}

public class SpecialAmazingClass extends AmazingClass {
    void amazingMethod(List l){
        System.out.println("Got list");
    };
    
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        Collection<String> c = al;
        AmazingClass ac = new SpecialAmazingClass();
        ac.amazingMethod(c);
    }
}

What is the output?
Please select 1 option
A. Compilation error
B. Exception at run time.
C. got collection
D. got list

Answer: C - got collection

2. What will the following code print?

String examName = "OCP Java 11";
String uniqueExamName = new String(examName);
String internedExamName = uniqueExamName.intern();
System.out.println(
    (examName==uniqueExamName)+" "+
    (examName == internedExamName)+" "+
    (uniqueExamName == internedExamName)
);

Please select 1 option:
A. false true true
B. false false false
C. true true true
D. true true false
E. false true false
F. true false true

Answer: E - false true false

3. How will you initialize a DateTimeFormatter object so that the following
code will print the number of the month (i.e. 02 for Feb, 12 for Dec, and so on)
and a two digit calendar year of any given date?

System.out.println(dtf.format(LocalDate.now()));

A. DateTimeFormatter sdf = DateTimeFormatter.ofPattern("mm/yy");
B. DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/yy");
C. DateTimeFormatter sdf = ofPattern("mm/YY");
D. DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/YY");
 
Answer: B, D

4. 
Consider the following class:
public class Student implements Serializable {
    public static final long serialVersionUID = 1;
    public String name;
    public String grade;
    public String toString(){ return "[" + name + "," + grade + "]"; }
}

An object of this class was created as follows and was serialized to a file
c:\temp\bob.ser:
    Student s = new Student();
    s.name = "bob";
    s.grade = "10";

After some time the Student class was changed as follows:
public class Student implements Serializable {
    public static final long serialVersionUID = 1;
    public String id = "S111";
    public String name;
    public String grade;
    public int age = 15;
    public String toString(){
        return "[" + id + ", " + name + "," + grade + ", " + age + "]";
    }
}

Now, the serialized file is read back as follows:

FileInputStream fis = new FileInputStream("c:\\temp\\bob.ser");
ObjectInputStream is = new ObjectInputStream(fis);
s = (Student) is.readObject();
is.close();
System.out.println("Loaded " + s);

What will it print?
A. It will throw an exception while deserializing the file.
B. Loaded [null, bob, 10, 0]
C. Loaded [S111, bob, 10, 15]
D. It will have unpredictable values for id and age.

Answer: A

5.
Given the following contents of module-info.java,

module enthu.finance {
    exports com.enthu.Reports to com.enthu.tax;
    require transitive enthu.utils;         
}

Select correct statements.
Please 1 option:
A. Which ever module requires enthu.finance, must require
enthu.utils as well.
B. The enthu.finance module requires all modules required by
enthu.utils.
C. The enthu.finance module requires only those modules that
are required by enthu.utils but does not require enthu.utils itself.
D. Only class from the com.enthu.tax module are allowed to read
classes in the com.enthu.Reports package.
E. The enthu.finance module exports only those classes that are used
by the com.enthu.tax module.
F. This is an invalid module definition because exports-to and requires-transitive
clauses cannot be used together.

Answer: D

6. Which of the following are benefits of ArrayList over an array?
Please select 1 option:
A. You do not have to worry about the size of the ArrayList while appending elements.
B. It consumes less memory space.
C. You do not have to worry about thread safety.
D. It allows you to write type safe code.

Answer: A - You do not have to worry about the size of the ArrayList while appending elements.

7. What will the following code print?
var a = new int[]{1, 2, 3, 4, 5};
var b = new int[]{1, 2, 3, 4, 5, 3};
var c = new int[]{1, 2, 3, 4, 5, 6};

int x = Arrays.compare(a, c);
int y = Arrays.compare(b, c);
System.out.println(x+" "+y);

Please select 1 option:
A. -1 -1
B. 1 1
C. -1 -3
D. 1 3

Answer: A. -1 -1

8. What changes can be done to the following code so that it will compile and run without
throwing an exception?

List<String> keys = List.of("a"); // 1
keys.add("b"); // 2

Map<String, String> map = Map.of(); // 3

int i = 0;
for (var key : keys){
    map.put(key, "-----");
}
System.out.println(keys+ " " + map.size());

Please select 1 option:
A. No change is necessary; it will print 2 2
B. No change is necessary; it will print 2 1
C. Remove // 2
D. Remove // 2 and change Map.of() in //3 to new TreeMap<>()

Answer: D. Remove // 2 and change Map.of() in //3 to new TreeMap<>()

9. Identify correct statements about Java platform module system.
Please select 2 options:
A. A module is a set of packages that make sense being grouped together and is
designed for reuse.
B. The module system ensures that code that is internal to a platform implementation
is not accessible from outside the implementation.
C. The module system uses only two phases - compile time and run time - for
building an application.
D. All classes in a module are concealed and cannot be accessed by code from other
modules. Only interfaces are visible outside the package.

Answer: A - A module is a set of packages that make sense being grouped together
and is designed for reuse.
B - The module system ensures that code is internal to a platform implementation
is not accessible from outside the implementation.

10. Which of the given options if put at //1 will correctly instantiate objects of
various classes defined in the following code?

public class TestClass {
    public class A {
    }
    
    public static class B {
    }
    public static void main(String args[]) {
        class C {
        }
        // 1    
    }
}

Please select 2 options
A. new TestClass().new A();
B. new TestClass().new B();
C. new TestClass().A();
D. new C();
E. new TestClass.C();

Answer: A - new TestClass().new A(), D - new C()

11. Given:
@Retention(value=RUNTIME)
@Target(value={TYPE_USE,TYPE_PARAMETER)
public @interface NonNull {
}

Identify correct usages.
Please select 2 options:
A. @NonNull String str = "";
B. var str = @NonNull "";
C. var str = (@NonNull String) "";
D. Function<Integer, String> f = (Integer @NonNull val) -> Integer.toHexString(val);
E. Function<Integer, String> f = (var @NonNull val) -> Integer.toHexString(val);
F. Function<Integer, String> f = ( @NonNull val ) -> Integer.toHexString(val);

Answer:
A - @NonNull String str = "";
C - var str = (@NonNull String) "";

12. Which of the following are valid code snippets appearing in a method:
Please 3 options
A. var a = b = c = 100;
B. var a = 100, b = 10; var a = b;
C. int a, b, c = 100;
D. int a = 100, b, c;
E. int a = 100 = b = c;
F. int a = b = c = 100;
G. int a, b, c; a = b = c = 100;

Answer: C, G

13. Consider the following code snippet

XXXX m ;
// other code initializes m
    switch( m ) {
        case 32 : System.out.println("32"); break;
        case 64 : System.out.println("64"); break;
        case 128 : System.out.println("128"); break;
    }
    
What type can 'm' be of so that the above code compiles and runs as expected ?
Please select 3 options
A. int m;
B. long m;
C. char m;
D. byte m;
E. short m;
F. var m;

Answer: A, C, D

14. What will be the result of compiling and running the following code:

float foo = 2, bar = 3, baz = 4; // 1
float mod1 = foo % baz, mad2 = baz % foo; // 2

float val = mod1 > mod2 ? bar : baz; // 3
System.out.println(val);

Please select 1 option
A. Compilation error at //1
B. Compilation error at //2
C. Compilation error at //3
D. 3
E. 3.0
F. 3.0f
G. 4
H. 4.0
I. 4.0f

Answer: E - 3.0

15. Consider the following code appearing in a module-info.java

module com.amazing.movies { // 1
    exports com.amazing.movies; // 2
    exports com.amazing.movies to com.amazing.rentals; // 3
    requires transitive com.amazing.customer; //4
}

Identify correct statements.
Please select 1 option
A. This is a valid module info.
B. This is an invalid module info because the name of the module and the
name of a package that it exports are the same.
C. This is an invalid module info because line marked //3 uses incorrect syntax.
D. This is an invalid module info because lines marked //2 and //3 are in conflict.
E. This is an invalid module info because lines marked //3 and //4 use incorect
syntax.

Answer: D

16. Consider the following

public class TestClass2 {
    public static void main(String[] args){
        TestClass tc = new TestClass();
        tc.myMethod();
    }
    
    public void myMethod() {
        yourMethod();
    }
    
    public void yourMethod() {
        throw new Exception();
    }
}

What changes can be done to make the above code compile?
Please select 1 option:
A. Change declaration of main to:
public static void main(String[] args) throws Exception
B. Change declaration of myMethod to public void myMethod
throws Exception
C. Change declaration of yourMethod to public void yourMethod
throws Exception
D. Change declaration of main and yourMethod to:
public static void main(String[] args) throws Exception
and public void yourMethod throws Exception
D. Change declaration of all the three method to include throws Exception.

Answer: D - change declaration of all the three method to include throws Exception.

17. What will the following code print when compiled and run?

var nameList = new ArrayList<>();
nameList.add("Ally");
nameList.add("Billy");
nameList.add("Cally");
nameList.add("Billy");
nameList.add("Ally");

var nameSet1 = new HashSet<String>();
for (var name : nameList) nameSet1.add(name);
var nameSet2 = new HashSet<String>(nameList);
System.out.println(nameList.size())+ " " + nameSet1.size() + " " + nameSet2.size();

Please select 1 option:
A. 5 3 5
B. 5 3 3
C. 5 3 1
D. 3 3 1
E. 5 5 5
F. 5 5 1

Answer: B - 5 3 3

What if anything, is wrong with the following code:

interface T1 {
}
interface T2 {
    int VALUE = 10;
    void m1();
}

interface T3 extends T1, T2 {
    public void m1();
    public void m1(int x);
}

Please select 1 option:
A. T3 cannot implement both T1 and T2 because it leads to ambiguity.
B. There is nothing wrong with the code.
C. The code will work fine only if VALUE is removed from T2 interface.
D. The code will work fine only if m1() is removed from either T2 and T3.
E. None of the above.

Answer: B - there is nothing wrong with the code.

19. Your application is packaged in myapp.jar and depends on a jar named
datalayer.jar, which in turn depends on mysql-connector-java-8.0.11.jar.
The following packages exist in these jars:

myapp.jar: com.abc.myapp
datalayer.jar: com.abc.datalayer
mysql-connector-8.0.11.jar: com.mysql.jdbc

You want to use bottom up approach for migrating your app to a modular
app. Which of the following is required before you can do this?
Please select 1 option
A. Mysql driver jar and datalayer.jar must first be converted into modular jars.
B. datalayer.jar must first be converted into modular
jar. The mysql jar need not be converted.
C. The mysql jar must first be converted into modular.jar. The datalayer.jar
need not be converted.
D. Neither datalayer nor mysql driver need to be converted into modular jars.

Answer: A - Mysql driver jar and datalayer.jar must first be converted into modular
jars.

20. Which of the following statements are correct regarding the module system of Java.
Please select 2 options:
A. Although not recommended, it is possible to customize what packages a module
exports from the command line.
B. An advantage of java modules functionality is that users of a module cannot
alter the list of exported packages of that module.
C. If a module does not export a package, there is no way to export that
package to all other modules from the command line.
D. If a module wants to read another module but only temporarily, it can request
such access using command line options.
E. A module can request access to another module temporarily using command line 