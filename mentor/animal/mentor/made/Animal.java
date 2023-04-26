package mentor.animal.mentor.made;

public class Animal
{

  protected AnimalType animalType;

  public Animal()
  {
  }

  public AnimalType getAnimalType()
  {
    return animalType;
  }

  public void walk()
  {
    System.out.println("I am walking");
  }

  @Override
  public String toString()
  {
    return "Animal{}";
  }
}

