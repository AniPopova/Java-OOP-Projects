package homework4.autoShop;

import java.util.ArrayList;
import java.util.List;

public class MyOwnAutoShop {

  public static void main(String[] args) {

    List<Object> vehicles = new ArrayList<>();
    vehicles.add(new Sedan(200, 12000, "Blue", 5));
    vehicles.add(new Ford(220, 15000, "Red", 2022, 10));
    vehicles.add(new Ford(223, 17000,"Yellow" , 2022, 0));
    vehicles.add(new Car(180, 10000,"White" ));
    vehicles.add(new Truck(160, 20000, "Black", 2022));

    for (Object vehicle : vehicles) {
      System.out.println(
          "The price of " + vehicle.getClass().getSimpleName()
              + " is $" + ((Car) vehicle).getSalePrice());
    }
  }
}
