package mentor.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Animal> animals = new ArrayList<>();
    ZooKeeper gosho = new ZooKeeper();

    int numberOfAnimals = Integer.parseInt(input.nextLine());
    for (int i = 0; i < numberOfAnimals; i++) {
      String type = input.nextLine();
      String name = input.nextLine();
      double weight = Double.parseDouble(input.nextLine());
      switch (type) {
        case "Lion":
          Lion lion = new Lion();
          lion.setType(type);
          lion.setName(name);
          lion.setWeight(weight);
          animals.add(lion);
          break;
        case "Monkey":
          Monkey monkey = new Monkey();
          monkey.setType(type);
          monkey.setName(name);
          monkey.setWeight(weight);
          animals.add(monkey);
          break;
        case "Fox":
          Fox fox = new Fox();
          fox.setType(type);
          fox.setName(name);
          fox.setWeight(weight);
          animals.add(fox);
          break;
        default:
          System.out.println("No such animal");
      }

    }
    gosho.setAnimalList(animals);
    String animalToFeed;
    do {
      animalToFeed = input.nextLine();
      for (Animal animal : animals) {

        if (animalToFeed.equalsIgnoreCase("Feed " + animal.getName())) {
          gosho.feedAnimal(animal.getName());

        }
      }

    } while (!animalToFeed.equals("0"));
    for (Animal animal : animals) {
      animal.calWeight();
      System.out.println(animal);

    }
  }
}
