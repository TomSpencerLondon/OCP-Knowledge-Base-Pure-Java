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

Answer: 