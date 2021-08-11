package com.codurance.ocppracticeexam.exam1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book {
  private String title;
  private String genre;

  public Book(String title, String genre){
    this.title = title;
    this.genre = genre;
  }

  public String getGenre() {
    return this.genre;
  }

  public String getTitle() {
    return this.title;
  }


}

public class ComparingPractice {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("new", "port"));
    books.add(new Book("old", "over"));
    books.add(new Book("fast", "over"));
    books.add(new Book("last 2nd", "over"));
    Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre());

    books.stream().sorted(c1.thenComparing(Book::getTitle)).forEach(b -> {
      System.out.print(b.getGenre() + " ");
      System.out.println(b.getTitle());
    });

    int i, j, k;
    i = j = k = 9;
    System.out.println(i);
  }
}
