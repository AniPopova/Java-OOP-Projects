package svetlanaProycheva.book7.books;

import svetlanaProychevaHomeworks.Book03072022;

public class BookTest {

  public static void main(String[] args) {
    Book03072022 book = new Book03072022();
    book.setTitle("War and piece");
    book.setAuthor("Leo Tolstoy");
    book.getISBN();
    book.setPublisher("Lions gate");
    book.setPages(1600);
    book.setPrice(100);
    Book03072022.printAttributes(book);
  }

}
