package mentor.animal.mentor.made;

public class Mammal extends Animal
{

  public Mammal()
  {
    super.animalType = AnimalType.MAMMAL;
  }

  @Override
  public String toString()
  {
    return "Mammal{}";
  }
}
