package homework4.movable;

public class Circle implements Movable {

  private int radius;
  private MovablePoint center;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public MovablePoint getCenter() {
    return center;
  }

  public void setCenter(MovablePoint center) {
    this.center = center;
  }

  public void moveUp(){

  }

  public void moveDown(){

  }

  public void moveLeft(){

  }

  public void moveRight(){

  }

  @Override
  public String toString() {
    return "Circle has radius of " + radius +
        " and center " + center;
  }

}
