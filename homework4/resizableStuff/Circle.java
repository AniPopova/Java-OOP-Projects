package homework4.resizableStuff;

public class Circle implements GeometricObject{

  private static final double PI = 3.14;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
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
