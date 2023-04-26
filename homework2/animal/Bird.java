package animal2;

public class Bird extends Animal{
  public void fly(){
    System.out.println("I am flying");
  }
  public void sing(){
    System.out.println("I am singing ");
  }

  @Override
  public String toString() {
    return "Bird{}";
  }
}
