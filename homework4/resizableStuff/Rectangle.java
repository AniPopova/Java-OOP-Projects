package homework4.resizableStuff;

public class Rectangle implements GeometricObject{
  
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getArea() {
    return length * width;
  }

  @Override
  public double getPerimeter() {
    return 2 * length + 2 * width;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "length=" + length +
        ", width=" + width +
        '}';
  }
}
