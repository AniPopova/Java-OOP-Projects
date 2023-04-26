package accessControl.phoneBook;

import java.util.Scanner;

public class PhoneBookTest {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    PhoneBook contacts = new PhoneBook();

    contacts.insert("Ava Maxx / 0882-831-633");
    contacts.insert("Phil Collins / 0882-831-632");
    contacts.insert("Madonna / 0882-831-634");
    contacts.insert("Richard Marx / 0882-831-635");
    contacts.insert("John Bon Jovi / 0882-831-637");
    contacts.insert("John Secada / 0882-831-636");
    contacts.insert("Klaus Meine / 0882-831-639");
    contacts.insert("Snoop Dog / 0882-831-640");
    contacts.insert("Alice Cooper / 0882-831-642");
    contacts.insert("Axl Rose / 0882-831-645");

    System.out.println(contacts);

    mainLoop:
    while (true) {
      contacts.printChoices();
      int choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
        case 1:
          System.out.print("Въведете име: ");
          String name = scanner.nextLine();
          System.out.print("Въведете телефонен номер: ");
          String phone = scanner.nextLine();
          String newContact = name.concat(" / ").concat(phone);
          contacts.checkNumber(phone);
          contacts.insert(newContact);
          break;
        case 2:
          System.out.print("Въведете номера, който искате да изтриете:");
          String phoneToDelete = scanner.nextLine();
          contacts.deleteByPhoneNumber(phoneToDelete);
          System.out.printf("\u001B[33m%s беше изтрит! \u001B[0m%n", phoneToDelete);
          break;
        case 3:
          System.out.print("Изведи всички контакти, които започват с: ");
          String nameSelections = scanner.nextLine();
          contacts.getAllNamesStartingWith(nameSelections);
          break;
        case 4:
          System.out.println("Принтирай телефонния указател.");
          System.out.println(contacts);
          break;
        case 5:
          break mainLoop;
        default:
          contacts.invalidChoice();
      }
    }
  }
}
