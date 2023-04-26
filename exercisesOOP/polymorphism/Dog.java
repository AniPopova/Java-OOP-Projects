package exercisesOOP.polymorphism;

public class Dog extends Animal{

  private String breed;

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void eat() {
    System.out.println("chump, chump");
  }

  @Override
  public String toString() {
    return "My dog " + getName()+
        " is from " + breed + " breed. "+"\n" + super.toString();
  }
}
