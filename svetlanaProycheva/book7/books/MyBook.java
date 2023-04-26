package svetlanaProycheva.book7.books;

public class MyBook {
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

  public  void display(){
    System.out.println("The title of the blok is: "+getTitle());
    System.out.println("The author is: "+getAuthor());
    System.out.println(getISBN());
    System.out.printf("The blok has %d pages\n", getPages());
    System.out.println("The price is: "+getPrice()+" BGN");
  }
}



