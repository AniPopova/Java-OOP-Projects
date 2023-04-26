package exercisesOOP.polymorphism;

public class Polymorphism {

  public static void main(String[] args) {

    Animal myAnimal = new Animal();
    myAnimal.eat();

    Dog myDog = new Dog();
    myDog.eat();
    myDog.setBreed("Huskey");
    myDog.setName("Richard");
    myDog.setColor("Green");

    Cat myCat = new Cat();
    myCat.eat(5);

    System.out.println(myDog);

  }
}
