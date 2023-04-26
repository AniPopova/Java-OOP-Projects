package mentor.petShop;

public class Dog extends Animal implements Walkable, Speackable{

  public Dog() {
    super();
  }

  @Override
 public void makeNoise() {
    System.out.println(super.getName()+" казва джаф, джаф.");
  }

  @Override
  public void walk() {
    System.out.println(super.getName()+" като повечето кучета обича разходките и тича след котките!");
  }

  @Override
  public String toString() {
    return "Куче на име " +  super.getName() + "\n"+ super.toString()+ " ";
  }
}
