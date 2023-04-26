package svetlanaProycheva.random.tasks;

public class Book {
  private String title;
  private String author;
  private String ISBN;
  private int pages;
  private String publisher;
  private double price;

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

  public static void printAttributes(Book book){
    System.out.println("The title of the blok is: "+book.getTitle());
    System.out.println("The author is: "+book.getAuthor());
    System.out.println(book.getISBN());
    System.out.printf("The blok has %d pages\n", book.getPages());
    System.out.println("The price is: "+book.getPrice()+" BGN");
  }
}



