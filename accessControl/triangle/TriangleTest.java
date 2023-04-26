package accessControl.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A:");
        double sideA = Double.parseDouble(scanner.nextLine());
        sideA = validateInput(sideA, scanner);

        System.out.println("Enter side B:");
        double sideB = Double.parseDouble(scanner.nextLine());
        sideB = validateInput(sideB, scanner);

        System.out.println("Enter angle Gamma:");
        double angleGama = Double.parseDouble(scanner.nextLine());
        angleGama = validateInput(angleGama, scanner);

        Triangle triangle = new Triangle(sideA, sideB, angleGama);

        System.out.println(triangle);
        System.out.printf("The area of the triangle is : %.2f\n", triangle.getArea());
        System.out.printf("The perimeter of the triangle is : %.2f\n", triangle.getPerimeter());
    }

    private static double validateInput(double parameter, Scanner scanner) {
        while (parameter <= 0) {
            System.out.println("Invalid value please try again!");
            parameter = Double.parseDouble(scanner.nextLine());
        }
        return parameter;
    }
}