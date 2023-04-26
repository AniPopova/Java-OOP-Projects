package homework7;

import java.util.Scanner;

public class PhoneBookTest {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    PhoneBook contacts = new PhoneBook();

    contacts.insert("0882-831-633","Ava Maxx");
    contacts.insert("0882-831-632","Phil Collins ");
    contacts.insert(" 0882-831-637","John Bon Jovi ");
    contacts.insert("0882-831-636","John Secada");
    contacts.insert("0882-831-640","Snoop Dog");
    contacts.insert("0882-831-642","Alice Cooper");
    contacts.insert("0882-831-645","Axl Rose");

  //  System.out.println(contacts);

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
          contacts.insert(phone,name);
          break;
        case 2:
          System.out.print("Въведете номера, който искате да изтриете: ");
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
