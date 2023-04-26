package homework2.shapes;

import java.util.Objects;

public class Triangle extends Shape implements Comparable<Triangle> {

  private double sideA;
  private double sideB;
  private double sideC;
  private double height;

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }

  public double getSideC() {
    return sideC;
  }

  public void setSideC(double sideC) {
    this.sideC = sideC;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return (sideB * height) / 2;
  }

  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Triangle)) {
      return false;
    }
    Triangle triangle = (Triangle) o;
    return Double.compare(triangle.getSideA(), getSideA()) == 0
        && Double.compare(triangle.getSideB(), getSideB()) == 0
        && Double.compare(triangle.getSideC(), getSideC()) == 0
        && Double.compare(triangle.getHeight(), getHeight()) == 0;
  }


  @Override
  public int hashCode() {
    return Objects.hash(getSideA(), getSideB(), getSideC(), getHeight());
  }

  @Override
  public int compareTo(Triangle o) {

    if (this.height > o.height) {
      return 1;
    } else if (this.height < o.height) {
      return -1;
    }
    return 0;

   // return Double.compare(o.height, this.height);
  }
}
