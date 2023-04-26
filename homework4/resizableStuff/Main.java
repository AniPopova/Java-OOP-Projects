package homework4.resizableStuff;

public class Main {

  public static void main(String[] args) {
    GeometricObject circle = new Circle(10);
    System.out.println("Circle area is: "+circle.getArea());
    System.out.printf("Circle circumference is: %.2f %n",circle.getPerimeter());


    GeometricObject rectangle = new Rectangle(3, 5);
    System.out.println("Rectangle area is: "+rectangle.getArea());
    System.out.println("Rectangle perimeter is: "+rectangle.getPerimeter());

    ResizedCircle circle2 = new ResizedCircle(((Circle)circle).getRadius());
    circle2.resize(10);
    System.out.println("Circle 2 area is: "+circle2.getArea());
    System.out.println("Circle 2 circumference is: "+circle2.getPerimeter());
  }

}
