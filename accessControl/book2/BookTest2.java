package accessControl.book2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookTest2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Book2> bookInfo = new ArrayList<>();

    int option;
    System.out.println("Моля изберете една от двете опции 1. Да въведе книга или 2. Изход");
    while ((option = Integer.parseInt(input.nextLine())) != 2) {

      if (option == 1) {
        System.out.println("Добавете книга:");
        Book2 newBook = new Book2();
        System.out.print("Book: ");
        newBook.setTitle(input.nextLine());
        System.out.print("Author: ");
        newBook.setAuthor(input.nextLine());
        System.out.print("ISBN: ");
        newBook.setISBN(input.nextLine());
        System.out.print("Publisher: ");
        newBook.setPublisher(input.nextLine());
        System.out.print("Pages: ");
        newBook.setPages(Integer.parseInt(input.nextLine()));
        System.out.print("Price: ");
        newBook.setPrice(Double.parseDouble(input.nextLine()));
        bookInfo.add(newBook);
      } else {
        System.out.println("Wrong choice!");
      }
      System.out.println("Моля изберете една от двете опции 1. Да въведе книга или 2. Изход");
    }

    System.out.println(Arrays.toString(bookInfo.toArray())
        .replace("[", "")
        .replace("]", "")
        .replace(", ", "\n"));
    System.out.println("And we have " + Book2.counter + " book/books in the library.");
  }
}

