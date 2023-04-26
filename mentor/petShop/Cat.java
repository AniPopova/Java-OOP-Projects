package mentor.petShop;

public class Cat extends Animal implements Walkable, Speackable{


  public Cat() {
    super();
  }

  @Override
  public String toString() {
    return "Котка на име " + super.getName()+ "\n"+ super.toString()+ " " ;
  }

  @Override
  public void makeNoise() {
    System.out.printf("%s обича да мяука. ", super.getName());
  }

  @Override
  public void walk() {
    System.out.println("Вижте само каква величествена походка има котето!");
  }
}
