package homework1.random;

import java.util.Random;

public class DoubleInRange extends Random {

  public double getRandomDoubleInRange(double min, double max) {
    Random theRandom = new Random();

    // Checking for a valid range
    if (!Double.valueOf(max - min).isInfinite()) {
      return min + (max - min) * theRandom.nextDouble();
    }

    return 0;
  }

}
