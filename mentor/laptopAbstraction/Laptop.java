package mentor.laptopAbstraction;

import java.math.BigDecimal;

public abstract class Laptop {

  private String brand;
  private String model;
  private BigDecimal price;

  public Laptop(String brand, String model, BigDecimal price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Laptop " +"\n"+
        "brand:" + brand + "\n" +
        "model:" + model + "\n" +
        "price: " + price;
  }

}
