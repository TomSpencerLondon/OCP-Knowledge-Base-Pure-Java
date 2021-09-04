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

10. Which of the given 