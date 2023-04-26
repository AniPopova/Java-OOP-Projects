package homework5.triangle.modification;

import java.util.Scanner;

public class TriangleTest
{
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args)
  {
    System.out.println("Въведете страна A:");
    double sideA = Triangle.validateInput();

    System.out.println("Въведете страна B:");
    double sideB = Triangle.validateInput();

    System.out.println("Въведете ъгъл гама: ");
    double angleGama = Triangle.validateInput();

    Triangle triangle = new Triangle(sideA, sideB, angleGama);

    System.out.println(triangle);
    System.out.printf("Лицето на триъгълника е : %.2f\n", triangle.getArea());
    System.out.printf("Обиколката на триъгълника е : %.2f\n", triangle.getPerimeter());
  }
}