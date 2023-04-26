package mentor.animal.mentor.made;

public class Bird extends Animal
{

  public Bird()
  {
    super.animalType = AnimalType.BIRD;
  }

  public void fly()
  {
    System.out.println("I am flying");
  }

  public void sing()
  {
    System.out.println("I am singing ");
  }


  @Override
  public String toString()
  {
    return "Bird{}";
  }


}
