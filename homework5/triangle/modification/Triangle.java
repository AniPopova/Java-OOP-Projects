package homework5.triangle.modification;


import java.util.Scanner;

public class Triangle
{
  public static Scanner scanner = new Scanner(System.in);
  private       double  sideA;
  private       double  sideB;
  private       double  sideC; // we need this side only to calculate angle Gama
  private       double  angleGama;

  public Triangle(double sideA, double sideB, double angleGama)
  {
    this.sideA = sideA;
    this.sideB = sideB;
    this.angleGama = angleGama;
    //here we have specific mathematical formulas
    this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(Math.toRadians(angleGama)));
    double x = ((Math.sin(Math.toRadians(angleGama))) * sideB) / sideC;
  }

  public double getPerimeter()
  {
    return this.sideA + this.sideB + this.sideC;
  }

  public double getArea()
  {
    return (sideA * sideB * Math.sin(Math.toRadians(angleGama))) / 2;
  }

  @Override
  public String toString()
  {
    return String.format("Триъгълник със страни A = %.2f, "
            + " B = %.2f и страна C = %.2f. Ъгъл Gama: %.2f",
        sideA, sideB, sideC, angleGama);
  }

  public static double validateInput()
  {
    double tester = 0;

    while (true) {
      try {
        tester = Double.parseDouble(scanner.nextLine());
        if (tester <= 0) {
          throw new IllegalArgumentException("Стойността не може да е отрицателно число!");
        }
        else {
          break;
        }
      }
      catch (NumberFormatException nfe) {
        System.err.println("Стойността трябва да е числова!");
      }
      catch (IllegalArgumentException iae) {
        System.err.println(iae.getMessage());
      }
    }
    return tester;
  }
}