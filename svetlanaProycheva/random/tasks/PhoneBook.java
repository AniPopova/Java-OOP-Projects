package svetlanaProycheva.random.tasks;

import java.util.*;

public class PhoneBook {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    HashMap <String,String> phoneBook = new HashMap<String,String>();

    printMenu();

    int choice = Integer.parseInt(scanner.nextLine());

    while (choice!=5){
      switch (choice){
        case 1:
          System.out.println("Въведете име-номер");
          addSomeboby(scanner,phoneBook);
          break;
        case 2:
          phoneBook.remove(scanner.nextLine());
          break;
        case 3:
          System.out.println("Въведете низ:");
          String str= scanner.nextLine();
          System.out.println(phoneBook.containsKey(str));
          System.out.println(phoneBook.get(str));
          break;
        case 4:
          System.out.println("Това е вашият телефонен указател:");
          printNewLine(phoneBook);
          break;
        case 5:
          break;

      }

      printMenu();
      choice = Integer.parseInt(scanner.nextLine());

    }
    System.out.println("Closing the phoneBook.");


  }

  private static void printMenu() {
    System.out.println("Изберете опция:\n1. Добави нов запис\n2. Изтрий запис по номер\n3. Покажи всички записи които започват с низ\n4. Принтирай указателят\n5. Изход");
  }

  private static void addSomeboby(Scanner scanner, HashMap<String, String> phoneBook) {
    String input = scanner.nextLine();
    String [] array= input.split("-");
    phoneBook.put(array[0],array[1]);
  }

  private static void printNewLine(HashMap<String, String> fun) {
    for (String i: fun.keySet()) {
      System.out.print(i + "\t" + "- ");
      System.out.println(fun.get(i));
    }


  }
  public static void getAllNamesStartingWith(HashMap<String, String> fun) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    if(fun.containsKey(name)){
      System.out.println(fun);
    }

  }
}