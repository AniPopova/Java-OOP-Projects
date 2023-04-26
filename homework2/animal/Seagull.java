package animal2;

public class Seagull extends Bird{

  @Override
  public void sing() {
    System.out.println("I am singing \"Kra Kra Kra\"");
  }

  @Override
  public String toString() {
    return "Seagull{}";
  }
}
