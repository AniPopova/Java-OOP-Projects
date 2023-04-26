package homework2.carfactory;

import java.util.Arrays;
import java.util.List;

public class Car {
  private static final double INITIAL_PRICE = 10_000;

  private String brand;
  private String model;
  private String bodyType;
  private String color;
  private double length;
  private double width;
  private double weight;
  private double price = INITIAL_PRICE;
  private TypeEngine typeEngine;
  private List<TypeExtra> extras;

  public Car() {
  }


//  public Car(String brand, String model, String bodyType, String color, double length, double width,
//      double weight, TypeEngine typeEngine, TypeExtra extra1,
//      TypeExtra extra2) {
//    this.brand = brand;
//    this.model = model;
//    this.bodyType = bodyType;
//    this.color = color;
//    this.length = length;
//    this.width = width;
//    this.weight = weight;
//    this.typeEngine = typeEngine;
//    this.extra1 = extra1;
//    this.extra2 = extra2;
//    this.price += extra1.getPrice() + extra2.getPrice();
//
//  }

  public List<TypeExtra> getExtras() {
    return extras;
  }

  public void setExtras(List<TypeExtra> extras) {
    this.extras = extras;
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

  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice() {
    double sum = 0;
    for (TypeExtra extra : this.extras) {
      sum = extra.getPrice();
    }
    this.price = price + sum;
  }

  public TypeEngine getEngine() {
    return typeEngine;
  }

  public void setEngine(TypeEngine typeEngine) {
    this.typeEngine = typeEngine;
  }

  @Override
  public String toString() {
    return "Car: " +
        "brand: " + brand + "\n" +
        "model: " + model + "\n" +
        "body type: " + bodyType + "\n" +
        "color: " + color + "\n" +
        "length: " + length + "\n" +
        "width: " + width + "\n" +
        "weight: " + weight + "\n" +
        "price: " + price + "\n" +
        "type of the engine: " + typeEngine + "\n" +
        "has extra as: " + Arrays.toString(extras.toArray()).replace("[", "").replace("]", "") + "\n";
  }
}

