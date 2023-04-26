package accessControl.book2;

import java.util.Scanner;

class Book2 {
  private String title;
  private String author;
  private String ISBN;
  private int pages;
  private String publisher;
  private double price;
  static int counter;

  public Book2() {
    this.counter++;
  }

  public Book2 (String title, String author, String ISBN, int pages, String publisher,
      double price) {
    Scanner input = new Scanner(System.in);
    this.title = input.nextLine();
    this.author = author;
    this.ISBN = ISBN;
    this.pages = pages;
    this.publisher = publisher;
    this.price = price;
    this.counter++;
  }

  public static Book2 createBook2() {
    return new Book2();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String toString() {
    return
        "title: " + title + "\n" +
        "author: " + author + "\n" +
        "ISBN: " + ISBN + "\n" +
        "pages: " + pages + "\n" +
        "publisher: " + publisher + "\n" +
        "price: " + price + "\n";
  }
}

