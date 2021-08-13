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



