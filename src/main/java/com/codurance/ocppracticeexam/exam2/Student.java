package com.codurance.ocppracticeexam.exam2;

import java.io.*;

public class Student implements Serializable {
    public static final long serialVersionUID = 1;
    public String id = "S111";
    public String name;
    public String grade;
    public int age = 15;
    public String toString(){
        return "[" + id + ", " + name + "," + grade + ", " + age + "]";
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File(System.getProperty("user.dir") + "/src/main/java/com/codurance/ocppracticeexam/exam2/bob.ser");
//        FileInputStreamPactice fis = new FileInputStreamPactice(file);
//        ObjectInputStream is = new ObjectInputStream(fis);
//        Student s = (Student) is.readObject();
//        is.close();
//        System.out.println("Loaded " + s);
    }
}

