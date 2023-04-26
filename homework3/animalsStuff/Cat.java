package homework3.animalsStuff;

public class Cat extends Animal implements Pet {

  private String name;

  public Cat() {
    this(4, "");
  }

  public Cat(int numberOfLegs, String name) {
    super(numberOfLegs);
    this.name = name;
  }

  @Override
  public void eat() {
    System.out.println("Cats eat mice.");
  }

  @Override
  public void getName() {
    System.out.println("Name of the cat is " + this.name);
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.printf("My name is %s, and I like playing with wool balls.%n", this.name);
  }

  @Override
  public String toString() {
    return "The cat is an animal. This cat is a pet, cats' name is " + name + " ." + super.toString();
  }
}
