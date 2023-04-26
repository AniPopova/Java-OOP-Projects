package homework4.movable;


public class Main {

  public static void main(String[] args) {
    MovablePoint movablePoint = new MovablePoint();
    movablePoint.setX(7);
    movablePoint.setY(9);
    movablePoint.setxSpeed(1);
    movablePoint.setySpeed(1);

    Circle circle = new Circle();
    circle.setRadius(5);
    circle.setCenter(movablePoint);

    System.out.println(circle);

    movablePoint.moveDown();

    System.out.println(circle);

    movablePoint.moveLeft();

    System.out.println(circle);
  }
}
