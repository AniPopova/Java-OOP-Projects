package accessControl.book1;

class Book1 {
  private String title;
  private String author;
  private String ISBN;
  private int pages;
  private String publisher;
  private double price;

  public Book1() {
  }

  public Book1(String title, String author, String ISBN, int pages, String publisher,
      double price) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.pages = pages;
    this.publisher = publisher;
    this.price = price;
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

  public static void printAttributes(Book1 book){
    System.out.println("The title of the blok is: "+book.getTitle());
    System.out.println("The author is: "+book.getAuthor());
    System.out.println("ISBN "+book.getISBN());
    System.out.println("The publisher is: "+book.getPublisher());
    System.out.printf("The blok has %d pages\n", book.getPages());
    System.out.println("The price is: "+book.getPrice()+" BGN");
  }

  @Override
  public String toString() {
    return "Book" +
        "title = " + title + "\n" +
        "author = " + author + "\n" +
        "ISBN = " + ISBN + "\n" +
        "pages = " + pages + "\n" +
        "publisher = " + publisher + "\n" +
        "price = " + price;
  }
}
