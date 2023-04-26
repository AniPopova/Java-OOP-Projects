package homework2.carfactory;
public enum TypeExtra {

  AIR_CONDITIONER(1500),
  AUTOMATIC(3000),
  NAVIGATION(500),
  AUTO_PILOT(350),
  ELECTRICAL_GLASS(250);

  private double price;

  TypeExtra(double priceValue) {
    price = priceValue;
  }

  public double getPrice() {
    return price;
  }

}
