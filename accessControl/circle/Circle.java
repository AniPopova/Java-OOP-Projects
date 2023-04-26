package accessControl.circle;

public class Circle {
  private static final double PI = 3.14;
  private double radius;
  private ColorType colorType;

  public Circle() {
  }

  public Circle(double radius, ColorType colorType) {
    this.radius = 1.0;
    this.colorType = colorType;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public ColorType getColorType() {
    return colorType;
  }

  public void setColorType(ColorType colorType) {
    this.colorType = colorType;
  }

  public double getArea() {
    return radius * PI;
  }

  public double getCircumference() {
    return 2 * PI * radius;
  }

  public void makeMeMoon(){
    colorType = ColorType.YELLOW;
  }

  @Override
  public String toString() {
    return "Кръг с радиус " + radius +" и диаметър " + (radius*2)+
    "\nПериметър: "+getCircumference()+
        "\nЛице: "+getArea()+"\nЦвят: "+getColorType()+"\n";
  }
}
