/**
 * Singleton Pattern: This pattern is used to ensure that only one instance of a class is created and provides a
 * global point of access to that instance.
 */
public class Singleton
{
  private static Singleton instance = null;

  private Singleton()
  {
    // private constructor
  }
  public static Singleton getInstance()
  {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
