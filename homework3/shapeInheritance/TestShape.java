package homework3.shapeInheritance;

public class TestShape {

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("Circle area is: " + circle.getArea());
    System.out.printf("Circle circumference is: %.2f%n", circle.getPerimeter());

    Square square = new Square(8);
    System.out.println("Square area is: " + square.getArea());
    System.out.println("Square perimeter is: " + square.getPerimeter());


  }

}
