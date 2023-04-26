package mentor.animal.mentor.made;

public class Parrot extends Bird {

  @Override
  public void sing() {
    System.out.println("I am singing \"How are you\"");
  }

  @Override
  public String toString() {
    return "Parrot{}";
  }
}
