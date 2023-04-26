package exercisesOOP.iterators.exceptionsAndMore;

import java.util.EnumMap;
import java.util.InputMismatchException;
import java.util.Scanner;


class AgeException extends Exception {

  private int age ;
  AgeException(String message,int age) {
    super( message+" You are welcome after "+ (18 - age)+" years.");
    this.age = age;
  }

}

enum Extras {
  NAVIGATION(500), Automatic(3000), AirConditional(850);

  private final double price;

  public double getPrice() {
    return price;
  }


  Extras(double price) {
    this.price = price;
  }

}


class Car {
  private String tradeMark;
  private String model;
  private String color;
  private Extras extra;
  private Engine engine;

  public static double price = 30_000;

  public Car(String tradeMark, String model, String color, Engine engine) {
    this.tradeMark = tradeMark;
    this.model = model;
    this.color = color;
    this.engine = engine;


  }

  public String getTradeMark() {
    return tradeMark;
  }

  public double getPrice() {
    return price;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public Extras getExtra() {
    return extra;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void setExtra(Extras extra) {
    this.extra = extra;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setTradeMark(String tradeMark) {
    this.tradeMark = tradeMark;
  }

  @Override
  public String toString() {
    return String.format("You are ordering %s,%s,with %s color and with engine %s, %s horse powers.", tradeMark,
        model, color, engine.type, engine.horsePower);
  }

  public static class Engine {
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
      this.type = type;
      this.horsePower = horsePower;

    }

    @Override
    public String toString() {
      return "Engine{" +
          "type='" + type + '\'' +
          ", horsePower=" + horsePower +
          '}';
    }
  }


}

public class CarsWithNestedClasses {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (!ageControl(scanner)) {
      return;
    }

    System.out.println("Insert a wished car in this follows : mark, model, color,type engine and horse powers, please.");

    String input = scanner.nextLine();
    String[] array = input.split(",");

    Car car1 = new Car(array[0], array[1], array[2], new Car.Engine(array[3], Integer.parseInt(array[4])));
    System.out.println(car1);
    System.out.println("The basic price is: " + Car.price);


    EnumMap<Extras, String> map = new EnumMap<Extras, String>(Extras.class);
    int countOptions = 0;
    int countNavigation = 0;
    int countAutomatic = 0;
    int countAirCondition = 0;
    map.put(Extras.NAVIGATION, "1");
    map.put(Extras.Automatic, "2");
    map.put(Extras.AirConditional, "3");

    int option = 0;
    System.out.println("And now ,you are welcome in our car extras menu!");
    printExtrasCatalog();
    double carPriceBasicModel = Car.price;

    try {

      while (option != 4 && countOptions < 3) {
        System.out.println("Please select an option: ");
        option = scanner.nextInt();

        countOptions++;
        if (option == 1 && countNavigation < 1) {
          countNavigation++;
          carPriceBasicModel = carPriceBasicModel + 500;
          selectExtra(Extras.NAVIGATION);
          map.remove(Extras.NAVIGATION);
          System.out.println("There left only options" + map + " and for exit from the menu=4");
        } else if (option == 2 && countAutomatic < 1) {
          countAutomatic++;
          carPriceBasicModel = carPriceBasicModel + 3000;
          selectExtra(Extras.Automatic);
          map.remove(Extras.Automatic);
          System.out.println("There are only  options" + map + " and for exit from the menu=4");
        } else if (option == 3 && countAirCondition < 1) {

          carPriceBasicModel = carPriceBasicModel + 850;
          selectExtra(Extras.AirConditional);
          map.remove(Extras.AirConditional);
          countAirCondition++;
          System.out.println("There are only options" + map + " and for exit from the menu=4");
        } else if (option == 4) {
          System.out.println("Thank you!");
        } else {
          System.out.println("Invalid option, please select again!");
          countOptions--;
          if (countOptions < 0) {
            countOptions = 0;
          }

        }

      }
      System.out.println("The price with added extras will be: " + carPriceBasicModel + "lv.");
    } catch (InputMismatchException e) {
      System.out.println("You have to put only int number, nothing else!");

    } catch (Exception e) {
      System.out.println("Something get wrong, check in google!!!");
    } finally {
      System.out.println("It's a good offer");
      scanner.close();
    }


  }

  private static boolean ageControl(Scanner scanner) {
    System.out.println("Welcome in our age control office!\nEnter your age");
    int age = Integer.parseInt(scanner.nextLine());

    try {
      checkAge(age);
      return true;
    } catch (Exception e) {
      System.out.println("A problem occurred: "+e.getMessage());

    }
    return false;
  }

  public static void printExtrasCatalog() {

    System.out.println("For Navigation press option 1.");
    System.out.println("For Automatic press option 2.");
    System.out.println("For Air conditional press option 3.");
    System.out.println("For exit from menu , please press option 4.");

  }


  public static void selectExtra(Extras extra) {
    switch (extra) {
      case Automatic:
        System.out.println("You choose automatic gear box. ");
        System.out.print("The price for this is: " + extra.getPrice() + " lv.\n");
        break;
      case NAVIGATION:
        System.out.println("You choose navigation map.");
        System.out.print("The price for this is: " + extra.getPrice() + " lv.\n");
        break;
      case AirConditional:
        System.out.print("You choose extra air condition. ");
        System.out.println("The price for this is: " + extra.getPrice() + " lv.\n");
        break;
    }

  }

  public static void checkAge(int age) throws AgeException {
    if (age < 18) {
      throw new AgeException("Boy, you are too young.",age);


    } else {
      System.out.println("You' re welcome in your shop!");

    }

  }
}


