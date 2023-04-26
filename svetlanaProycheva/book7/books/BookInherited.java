package svetlanaProycheva.book7.books;

import svetlanaProychevaHomeworks.Book03072022;

public class BookInherited {
  private String title;
  private String author;
  private final String ISBN;
  private long pages;
  private String publisher;
  private double price;

  public BookInherited() {
    ISBN = "24-38-523-1";
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

  public long getPages() {
    return pages;
  }

  public void setPages(long pages) {
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
  public static void printAttributes(Book03072022 book){
    System.out.println("The title of the blok is: "+book.getTitle());
    System.out.println("The author is: "+book.getAuthor());
    System.out.println(book.getISBN());
    System.out.printf("The blok has %d pages\n", book.getPages());
    System.out.println("The price is: "+book.getPrice()+" BGN");
  }
  public void toStringBook(String title, String author, String ISBN, long pages, String publisher, double price){
    System.out.printf("We want to read %StudentBook, which author is %StudentBook, serial number ISBN:%StudentBook, consisting of %d pages.\n"
        + "Published by %StudentBook for the price of %d BGN", title, author, ISBN, pages, publisher, price);
  }
}
