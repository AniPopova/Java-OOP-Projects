package homework3.shapeInheritance;

public class Square extends Shape{

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public String toString() {
    return "Square{" +
        "side=" + side +
        "} " + super.toString();
  }

  @Override
  public double getArea() {
return side*side;
  }

  @Override
  public double getPerimeter() {
   return side*4;
  }
}
