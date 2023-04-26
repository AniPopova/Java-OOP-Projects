package exercisesOOP.animalStuff;

public class Casting {

  public static void main(String[] args) {

//    Animal myAnimal = new Dog();
//    doAnimalStuff(myAnimal);
    Dog myDog = new Dog();
//    doAnimalStuff(myDog);
    int pepi = 5;
    Integer gosho = pepi;

    System.out.println(myDog instanceof Animal);
    Animal animal = new Animal();
    Dog animalToDog = (Dog) animal;
    animalToDog.growl();
    myDog.growl();
    System.out.println(animal instanceof Animal);

    System.out.println(animal instanceof Dog);
    System.out.println(animal instanceof Cat);




    Animal parsedDog = (Animal) myDog;

    System.out.println(parsedDog instanceof Animal);

    System.out.println(parsedDog instanceof Dog);
    System.out.println(parsedDog instanceof Cat);

//    Cat myCat = new Cat();
//    doAnimalStuff(myCat);

  }

  //  public static void doAnimalStuff(Animal animal) {
//    animal.makeNoise();
//  }
//  public static void doAnimalStuff(Animal current) {
//    current.makeNoise();
//
//    if (current instanceof Cat) {
//      Cat myCat = (Cat) current;
//     myCat.
//    }
//  }
}

