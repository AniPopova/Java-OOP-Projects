package mentor.petShop;

public class Fish extends Animal implements Swimmable{
  public Fish() {
    super();
  }

  @Override
  public String toString() {
    return "Риба на име " +  super.getName() + "\n"+ super.toString()+ "\n";
  }
  @Override

  public void swims() {
    System.out.println("Всички риби са добри плувци!");
  }
}


