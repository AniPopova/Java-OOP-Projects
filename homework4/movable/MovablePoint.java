package homework4.movable;

public class MovablePoint implements Movable {

  private int x;
  private int y;
  private int xSpeed;
  private int ySpeed;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  public void moveUp() {
    this.y -= ySpeed;
  }


  public void moveDown() {
    this.y += ySpeed;
  }


  public void moveLeft() {
    this.x -= xSpeed;
  }


  public void moveRight() {
    this.x += xSpeed;
  }


  @Override
  public String toString() {
    return "MovablePoint " +
        "x = " + x +
        ", y = " + y +
        ", xSpeed = " + xSpeed +
        ", ySpeed = " + ySpeed;
  }
}
