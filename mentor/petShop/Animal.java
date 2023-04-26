package mentor.petShop;

import java.util.Scanner;

public abstract class Animal {

  Scanner input = new Scanner(System.in);

  private String name;
  private double age;
  private double price;

  static int counter;

  public Animal() {
    counter++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "възраст: " + age + " години " +
        "цена: " + price + " BGN";
  }
}
