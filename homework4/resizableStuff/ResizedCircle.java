package homework4.resizableStuff;

public class ResizedCircle extends Circle implements Resizable {


  public ResizedCircle(double radius) {
    super(radius);
  }

  @Override
  public void resize(int percent) {
     setRadius(getRadius() * (percent/100.0) + getRadius());
  }
}
