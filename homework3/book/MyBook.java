package homework3.book;

public class MyBook extends Book {

  private String title;
  private String author;
  private double price;

  static int bookCounter = 0;

  public MyBook(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
    bookCounter++;
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

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void display() {
    String toPrint =
         "Заглавие: "+title +
        ", Автор: " + author +
        ", Цена: " + price ;
    System.out.println(toPrint);
  }


}
