package homework3.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List<MyBook> books = new ArrayList<>();

    System.out.println("Колко книги искаш да въведеш в библиотеката? ");
    int numberOfBooks = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numberOfBooks; i++) {

      System.out.print("Заглавие: ");
      String title = scanner.nextLine();
      System.out.print("Автор: ");
      String author = scanner.nextLine();
      System.out.print("Цена: ");
      double price = scanner.nextDouble();
      scanner.nextLine();

      books.add(new MyBook(title, author, price));

    }
    for (MyBook book : books) {
      book.display();
    }
    System.out.println("Общо " + MyBook.bookCounter + " книги.");


  }
}
