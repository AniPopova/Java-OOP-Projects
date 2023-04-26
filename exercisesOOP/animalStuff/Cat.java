package exercisesOOP.animalStuff;

public class Cat extends Animal{

  @Override
  public void makeNoise() {
    System.out.println("Meow, meow!");
  }
  public void makeClean(){
    System.out.println("Take shower!");
  }

}
