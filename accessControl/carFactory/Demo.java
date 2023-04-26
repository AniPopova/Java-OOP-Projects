package accessControl.carFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many cars do we produce for the day: ");
    int numberOfCars = scanner.nextInt();
    scanner.nextLine();
    List<Car> cars = new ArrayList<>(numberOfCars);
int counter = 0;

    for (int i = 0; i < numberOfCars; i++) {
      if (counter % 2 != 0) {
        Car car = new Car();

        System.out.println("Enter brand: ");
        car.setBrand(scanner.nextLine());
        System.out.println("Enter model: ");
        car.setModel(scanner.nextLine());
        System.out.println("Enter body type: ");
        car.setBodyType(scanner.nextLine());
        System.out.println("Choose color: ");
        car.setColor(scanner.nextLine());
        System.out.println("Set length: ");
        car.setLength(Double.parseDouble(scanner.nextLine()));
        System.out.println("Set width: ");
        car.setWidth(Double.parseDouble(scanner.nextLine()));
        System.out.println("Set weight: ");
        car.setWeight(Double.parseDouble(scanner.nextLine()));
        System.out.println("What type of engine: ");
        car.setEngine(TypeEngine.valueOf(scanner.nextLine()));
        System.out.print("How many extras do you want in the car: ");
        int numberOfExtras = scanner.nextInt();
        scanner.nextLine();
        List<TypeExtra> extras = new ArrayList<>(numberOfExtras);
        System.out.println("Choose extras for your car: ");
        for (int j = 0; j < numberOfExtras; j++) {
          TypeExtra extra = TypeExtra.valueOf(scanner.nextLine().toUpperCase());
          extras.add(extra);
          car.setExtras(extras);
          car.setPrice();
        }
        car.getExtras();
        car.getBodyType();
        cars.add(car);
        System.out.println(counter++);

      }

    }
    System.out.println(Arrays.toString(cars.toArray()).replace("[", "").replace("]", ""));
  }
}
