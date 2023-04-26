package svetlanaProycheva.book7;

public class MyBook {

  private String title;
  private String author;
  private double price;

  public MyBook() {
  }

  public MyBook(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void display() {
    System.out.printf("The author is %s, title %s and the price is %.2f%n", author, price, price);
  }

}
