package homework2.shapes;

import java.util.Objects;

public class Circle extends Shape {
    private final double PI = 3.14;
    private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double getPI() {
    return PI;
  }

  @Override
  public double getArea() {
    return radius * PI;
  }

  @Override
  public double getPerimeter() {
    return 2*PI*radius;
  }
  public  double getDiameter(){
    return 2*radius;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Circle)) {
      return false;
    }
    Circle circle = (Circle) o;
    return getRadius() == circle.getRadius()
        && Double.compare(circle.getPI(), getPI()) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getRadius(), getPI());
  }
}
