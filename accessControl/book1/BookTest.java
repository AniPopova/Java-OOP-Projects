package accessControl.book1;

import java.util.Scanner;

public class BookTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Book1 book = new Book1();
    Book1.printAttributes(book);

    System.out.println("Enter title: ");
    book.setTitle(input.nextLine());
    System.out.println("Enter author: ");
    book.setAuthor(input.nextLine());
    System.out.println("Enter ISBN: ");
    book.setISBN(input.nextLine());
    System.out.println("Enter pages: ");
    book.setPages(Integer.parseInt(input.nextLine()));
    System.out.println("Enter price: ");
    book.setPrice(Double.parseDouble(input.nextLine()));
    System.out.println("Enter publisher: ");
    book.setPublisher(input.nextLine());

    Book1.printAttributes(book);

  }
}
