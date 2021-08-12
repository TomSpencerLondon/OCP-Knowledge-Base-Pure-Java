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