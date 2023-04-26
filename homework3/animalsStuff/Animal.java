package homework3.animalsStuff;

public abstract class Animal {

  private int numberOfLegs;

  public Animal(int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }

  abstract void eat();

  public void walk() {
    System.out.printf("I am walking by moving my %d legs.%n", this.numberOfLegs);
  }

  @Override
  public String toString() {
    return "This animal has " + numberOfLegs +" number of legs.";
  }
}
