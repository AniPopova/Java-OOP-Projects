package homework3.animalsStuff;

public class Fish extends Animal implements Pet {

  private String name;

  public Fish() {
    this(0, "");
  }

  public Fish(String name) {
    this(0, name);
  }

  private Fish(int numberOfLegs, String name) {
    super(numberOfLegs);
    this.name = name;
  }

  @Override
  void eat() {
    System.out.println("Fish eats seaweed.");
  }

  @Override
  public void getName() {
    System.out.println("The name of the fish is " + this.name);
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    Pet.super.play();
  }

  @Override
  public void walk() {
    System.out.println("Fish do not walk!");
  }

  @Override
  public String toString() {
    return "Fish is an animal, which is sometimes a pet. The name of the fish is "+ name + " ."+ super.toString();
  }
}
