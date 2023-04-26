package svetlanaProycheva.book7.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book7 {
    /*Създайте клас MyBook който има абстрактен метод display()
Създайте клас MyBook който:
2.1 Наследява MyBook
2.2 Има конструктор с параметри title, author, price
2.3 Имплементира display() т. че да той да извежда конзолата следният изход: Title: <title>. Author: <author>. Price: <price>.
Създайте клас BookTest който чете книги от конзолата (преценете кога да спре четенето) и след това извежда книгите в конзолата.*/

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<MyBook> books = new ArrayList<>();
    for (;;) {
      System.out.println("1. Въведи книга. \n 2. Изход");
      int choice = sc.nextInt();

      if (choice > 2 || choice < 1) {
        System.out.println("Избери 1 или 2");
      }
      if (choice == 1) {
        System.out.println("Въведи цена, заглавие и автор.\n");
        books.add(new MyBook());
        books.get(books.size()-1).setPrice(sc.nextDouble());

        sc.next();
        books.get(books.size()-1).setTitle(sc.nextLine());
        sc.next();
        books.get(books.size()-1).setAuthor(sc.nextLine());

      }
      if (choice == 2){
        break;
      }

    }
    for (MyBook book : books){
      book.display();
      System.out.println();
    }
  }
}