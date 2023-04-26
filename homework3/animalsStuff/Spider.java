package homework3.animalsStuff;

public class Spider extends Animal {

  public Spider() {
    this(8);
  }

  public Spider(int numberOfLegs) {
    super(numberOfLegs);
  }

  @Override
  void eat() {
    System.out.println("Spiders eat flies and mosquitoes.");
  }

  @Override
  public void walk() {
    super.walk();
  }

  @Override
  public String toString() {
    return "Spider is an animal, that sometimes happens to be a pet. " + super.toString();
  }
}
