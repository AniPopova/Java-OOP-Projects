package exercisesOOP.lambas;

public class Cat implements Printable{

  private String name;
  private int age;

  public Cat() {
  }

//  @Override
//  public void print() {
//    System.out.println("Meow");
//  }

  @Override
  public void print(String suffix) {
    suffix = this.name;
    System.out.println("Meow"+suffix);
  }
}
