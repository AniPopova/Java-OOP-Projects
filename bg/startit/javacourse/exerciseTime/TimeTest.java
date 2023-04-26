package bg.startit.javacourse.exerciseTime;

import java.util.Scanner;

public class TimeTest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Time now = new Time();

    for (int i = 0; i < 3; i++) {
      System.out.println("Please enter hour:");
      now.setHour(scanner.nextInt());
      System.out.println("Please enter minutes:");
      now.setMinutes(scanner.nextInt());
      System.out.println("Please enter seconds:");
      now.setSeconds(scanner.nextInt());
      now.print();

      for (int j = 0; j < 65; j++) {
        now.thick();
        now.thick();
        now.print();
      }

      System.out.println();
    }
  }
}