package homework1.shapes;

public class TestShape {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 6);
    Square square = new Square(4);
    Shape rectangle2 = new Rectangle(7, 6);
    Shape square2 = new Square(8);

    System.out.println(square.getArea());
    System.out.println(square.getPerimeter());
    System.out.println(rectangle.getArea());
    System.out.println(rectangle.getPerimeter());
    System.out.println(square2.getArea());
    System.out.println(square2.getPerimeter());
    System.out.println(rectangle2.getArea());
    System.out.println(rectangle2.getPerimeter());

  }

}
