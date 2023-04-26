package homework3.shapeInheritance;

public class Circle extends Shape {

  private static final double PI = 3.14;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return PI * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    return 2 * PI * radius;
  }
}
