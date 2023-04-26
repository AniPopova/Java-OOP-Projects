package accessControl.phoneBook;

import static accessControl.phoneBook.PhoneBookTest.scanner;

import java.util.ArrayList;

public class PhoneBook {

  private ArrayList<String> data = new ArrayList<>();

  public void insert(String contact) {
    String phoneNumber = contact.split(" / ")[1];
    if (!phoneNumber.equals(phoneNumber)) {
      data.add(contact);
    }
    deleteByPhoneNumber(phoneNumber);
    data.add(contact);
  }

  public boolean deleteByPhoneNumber(String phoneNumber) {
    for (String contact : data) {
      String phone = contact.split(" / ")[1];
      if (phone.equals(phoneNumber)) {
        data.remove(contact);
        return true;
      }
    }
    return false;
  }
  public void checkNumber(String phone) {
    for (String contact : data) {
      String phoneNumber = contact.split(" / ")[1];
      if (phone.equals(phoneNumber)) {
        System.out.println("\u001B[32mАбонат с такъв номер съществува. Изберете 1, "
            + "за да бъде презаписан или 0, за да се върнете към началното меню.\u001B[0m");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 0) {
          return;
        } else if (choice == 1) {
          int index= findIndex(contact);
          data.set(index, contact);
        }
      }
    }
  }
  private int findIndex(String contact) {
    return data.indexOf(contact);
  }

  public void getAllNamesStartingWith(String nameToSort) {
    System.out.print("\u001B[31mИме / телефонен номер: \u001B[0m\n");
    for (String contact : data) {
      if (contact.toLowerCase().startsWith(nameToSort)) {
        System.out.println(contact);
      }
    }
  }
  public void printChoices() {
    System.out.println(
        "\u001B[34mМоля направете своя избор: \n(1)Добави нов запис; \n(2)Изтрий запис по номер;"
            + "\n(3)Покажи всички записи които започват с низ; \n(4)Принтирай контактите \n(5)Изход: \u001B[0m");
  }

  public void invalidChoice() {
    System.out.print("Невалиден избор.");
    printChoices();
  }

  @Override
  public String toString() {
    return "\u001B[31mИме / телефонен номер: \u001B[0m\n" + data
        .toString()
        .replaceAll("[\\[\\]]", "")
        .replace(", ", "\n");
  }
}

