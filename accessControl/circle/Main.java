package accessControl.circle;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Circle userCircle = new Circle();

    System.out.print("Въведете дължина на радиус или 0 за радиус по подразбиране [1.0]: ");
    int circleRadius = Integer.parseInt(input.nextLine());
    if (circleRadius == 0) {
      userCircle.setRadius(1.0);
    } else if (circleRadius != 0 && circleRadius > 0) {
      userCircle.setRadius(circleRadius);
    } else {
      System.out.println(
          "Невалиден радиус, моля дайте валидна стойност: " + (circleRadius = Integer.parseInt(
              input.nextLine())));
    }

    System.out.print("Въведете цвят на кръга: ");
    System.out.println("(1) за жълто; (2) за зелено; (3) за синьо или (4) за зелено: ");
    int numberOfColor = Integer.parseInt(input.nextLine());
    switch (numberOfColor) {
      case 1:
        userCircle.setColorType(ColorType.YELLOW);
        break;
      case 2:
        userCircle.setColorType(ColorType.GREEN);
        break;
      case 3:
        userCircle.setColorType(ColorType.BLUE);
        break;
      case 4:
        userCircle.setColorType(ColorType.RED);
        break;
      default:
        System.out.println("Няма такъв цвят.");
    }
    System.out.println(userCircle);

    if (userCircle.getColorType() != ColorType.YELLOW) {
      userCircle.makeMeMoon();
    }
    userCircle.getColorType();
    userCircle.getArea();
    userCircle.getCircumference();
    System.out.println(userCircle);

  }
}
