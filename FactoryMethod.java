/**
 * Factory Method Pattern: This pattern provides a way to create objects without
 * specifying the exact class of object that will be created.
 */
public class FactoryMethod
{
  public interface Shape
  {

    void draw();
  }

  public class Rectangle implements Shape
  {

    @Override
    public void draw()
    {
      System.out.println("Drawing a rectangle");
    }
  }

  public class Circle implements Shape
  {

    @Override
    public void draw()
    {
      System.out.println("Drawing a circle");
    }
  }

  public class ShapeFactory
  {

    public static Shape getShape(String shapeType)
    {
      if (shapeType == null) {
        return null;
      }
      if (shapeType.equalsIgnoreCase("RECTANGLE")) {
        return new Rectangle();
      }
      else if (shapeType.equalsIgnoreCase("CIRCLE")) {
        return new Circle();
      }
      return null;
    }
  }

}
