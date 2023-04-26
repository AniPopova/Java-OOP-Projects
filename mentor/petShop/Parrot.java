package mentor.petShop;

public class Parrot extends Animal implements Flyable, Walkable, Speackable{

  public Parrot() {
    super();
  }

  @Override
  public void makeNoise() {
    System.out.printf("%s обича бисквитки и често говори за тях.\n", super.getName());
  }


  @Override
  public void fly() {
    System.out.printf(" Като повечето други птици %s може да лети! ", getName());
  }

  @Override
  public void walk() {
    System.out.print("Обича да се разхожда по первази и покриви.\n");
  }

  @Override
  public String toString() {
    return "Папагал на име " + getName() +
        "\n" + super.toString();
  }
}

