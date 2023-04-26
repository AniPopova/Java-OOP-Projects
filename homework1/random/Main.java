package homework1.random;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DoubleInRange myRandom = new DoubleInRange();
    System.out.println(myRandom.getRandomDoubleInRange(scanner.nextDouble(), scanner.nextDouble()));
  }
}
