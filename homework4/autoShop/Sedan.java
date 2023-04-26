package homework4.autoShop;

public class Sedan extends Car {

  private double length;

  public Sedan(int speed, double regularPrice, String color, double length) {
    super(speed, regularPrice, color);
    this.length = length;
  }

  public double getSalePrice() {
    if (length > 6.5) {
      return super.getSalePrice() * 0.95;
    }
    return super.getSalePrice() * 0.9;
  }

}
