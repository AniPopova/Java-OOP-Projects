package accessControl.circle;

import java.util.Random;

public enum ColorType {

YELLOW(1), GREEN(2), BLUE(3), RED(4);

private int numberOfColor;

  public static ColorType getRandomColor() {
    Random random = new Random();
    return values()[random.nextInt(values().length)];
  }

 ColorType(int numberOfColor) {
   this.numberOfColor = numberOfColor;
  }
  public int getNumberOfColor(int numberOfColor) {
    return numberOfColor;
  }
}
