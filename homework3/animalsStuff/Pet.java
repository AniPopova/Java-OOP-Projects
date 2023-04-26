package homework3.animalsStuff;

public interface Pet {

  void getName();

  void setName(String name);

  default void play() {
    System.out.println("I am playing on my own.");
  }

}
