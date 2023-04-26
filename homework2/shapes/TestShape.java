package homework2.shapes;

public class TestShape {

  public static void main(String[] args) {

    Shape rectangle = new Rectangle();
    Shape square = new Square();
    Shape circle = new Circle();
    Triangle triangle = new Triangle();
    Triangle triangle2 = new Triangle();
    triangle.setSideA(5);
    triangle.setSideB(5);
    triangle.setSideC(5);
    triangle2.setSideA(5);
    triangle2.setSideB(5);
    triangle2.setSideC(5);


    if(rectangle instanceof Rectangle){
      ((Rectangle) rectangle).setWidth(2);
      ((Rectangle) rectangle).setHeight(3);
      System.out.println(((Rectangle) rectangle).getMaxPossibleSquareInside());
    }

    System.out.println(triangle2.equals(triangle));
    System.out.println(triangle.compareTo(triangle2));

  }
}
