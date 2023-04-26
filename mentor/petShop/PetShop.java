package mentor.petShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PetShop {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    double totalPrice = 0;
    Cat tiger = new Cat();
    Fish fish = new Fish();
    Parrot parrot = new Parrot();
    Dog dog = new Dog();
    List<Animal> totalAnimals = new ArrayList<Animal>();

    while (true) {
      String choice =
          "Моля изберете какво животно да си купите: \n"
              + "(1) Котка;\n"
              + "(2) Рибка;\n"
              + "(3) Папагал;\n"
              + "(4) Куче;\n"
              + "(5) Общо дължима сума/Изход";
      System.out.println(choice);
      int option = validInteger(choice);
      if (option == 1) {
        tiger.setName("Тигър");
        tiger.setPrice(150);
        tiger.setAge(4.5);
        System.out.println("О, искате да си купите котенце? Можем да ви предложим: " + tiger);
        tiger.makeNoise();
        tiger.walk();
        totalPrice = getTotalPrice(totalPrice, tiger, totalAnimals);
      } else if (option == 2) {
        fish.setName("Немо");
        fish.setPrice(50);
        fish.setAge(0.5);
        System.out.print("Нима искате да си купите рибка? Можем да ви предложим: " + fish);
        fish.swims();
        totalPrice = getTotalPrice(totalPrice, fish, totalAnimals);
      } else if (option == 3) {
        parrot.setName("Джорджо");
        parrot.setPrice(500);
        parrot.setAge(0.5);
        System.out.print("О желаете да закупите папагал? Можем да ви предложим: " + parrot);
        parrot.fly();
        parrot.walk();
        parrot.makeNoise();
        totalPrice = getTotalPrice(totalPrice, parrot, totalAnimals);
      } else if (option == 4) {
        dog.setName("Мечо");
        dog.setPrice(100);
        dog.setAge(0.5);
        System.out.println("О искате да закупите кученце? Можем да ви предложим: " + dog);
        dog.walk();
        dog.makeNoise();
        totalPrice = getTotalPrice(totalPrice, dog, totalAnimals);
      } else if (option == 5) {
        System.out.println(
            "Дължите общо " + totalPrice + " BGN. Вие закупихте:\n" + Arrays.toString(
                    totalAnimals.toArray())
                .replace("[", "")
                .replace("]", "")
                .replace(", ", "\n"));
        break;
      } else {
        validatingUserChoice();
      }
    }
  }

  private static double getTotalPrice(double totalPrice, Animal animal, List<Animal> totalAnimals) {
    System.out.printf("Взимате ли %s :", animal.getName());
    String confirmation = "(1) Да " + "или" + "(2) Не ";
    System.out.print(confirmation);
    int purchaseConfirmation = validInteger(confirmation);
    if (purchaseConfirmation == 1) {
      totalAnimals.add(animal);
      totalPrice += animal.getPrice();
    } else if (purchaseConfirmation == 2) {
    }
    return totalPrice;
  }

  public static int validInteger(String check) {
    while (true) {
      if (input.hasNextInt()) {
        return Integer.parseInt(input.nextLine());
      } else {
        validatingUserChoice();
        input.nextLine();
        System.out.print(check);
      }
    }
  }
  public static void validatingUserChoice() {
    System.out.println("\u001B[31mИзборът ви е невалиден, опитайте пак!\u001B[0m");
  }
}


