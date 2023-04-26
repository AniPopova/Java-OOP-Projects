package homework4.autoShop;

public class Truck extends Car {

  private int weight;

  public Truck(int speed, double regularPrice, String color, int weight) {
    super(speed, regularPrice, color);
    this.weight = weight;
  }

  public double getSalePrice() {
    if (weight > 2000) {
      return super.getRegularPrice()* 0.9;
    }
    return super.getRegularPrice() * 0.8;
  }

}
