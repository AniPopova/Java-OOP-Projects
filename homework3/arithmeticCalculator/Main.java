package homework3.arithmeticCalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Calculator elka = new Calculator();

    System.out.println(elka.divisorSum(Double.parseDouble(scanner.nextLine())));

  }
}
