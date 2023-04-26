package homework7;

import static homework7.PhoneBookTest.scanner;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {

  private Map<String, String> data = new HashMap<>();

  public void insert(String phoneNumber, String name) {
    updateNumber(phoneNumber, name);
  }

  public boolean deleteByPhoneNumber(String phoneNumber) {
    for (Map.Entry<String, String> entry : data.entrySet()) {
      if (data.containsKey(phoneNumber)) {
        data.remove(phoneNumber);
        return true;
      }
    }
    return false;
  }

  private void updateNumber(String phone, String name) {
    while (true) {
      if (data.containsKey(phone)) {
        System.out.println("\u001B[31mАбонат с такъв номер съществува. Изберете 1, "
            + "за да бъде презаписан или 0, за да се върнете към началното меню.\u001B[0m");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 0) {
          return;
        } else if (choice == 1) {
      System.out.println("\u001B[35mКонтакта беше презаписан успешно!\u001B[0m");
        } else {
          System.out.println("\u001B[33mИзбери отново.\u001B[0m");
          continue;
        }
      }
      data.put(phone, name);
      return;
    }
  }

  public void getAllNamesStartingWith(String nameToSort) {
    System.out.print("\u001B[31mИме / телефонен номер: \u001B[0m\n");
    for (Map.Entry<String, String> entry : data.entrySet()) {
      if (entry.getValue().toLowerCase().startsWith(nameToSort)) {
        System.out.println(entry.getValue() + " / " + entry.getValue());
      }
    }
  }

  public void printChoices() {
    System.out.println(
        "\u001B[34mМоля направете своя избор: \n(1)Добави нов запис; \n(2)Изтрий запис по номер;"
            + "\n(3)Покажи всички записи които започват с низ; \n(4)Принтирай съдържанието \n(5)Изход:\u001B[0m ");
  }

  public void invalidChoice() {
    System.out.print("Невалиден избор.");
    printChoices();
  }

  @Override
  public String toString() {
    return "\u001B[31mИме / телефонен номер: \u001B[0m\n" + data
        .entrySet()
        .stream()
        .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey))
        .toString()
        .replaceAll("[{}]", "")
        .replace("=", " / ")
        .replace(", ", "\n");
  }
}

