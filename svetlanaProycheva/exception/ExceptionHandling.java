package svetlanaProycheva.exception;

public class ExceptionHandling
{
  public static void main(String[] args)
  {
    try {
      int myInt = Integer.parseInt("pony");
    }
    catch (NumberFormatException nfe) {
      System.err.println("You can not make an int from that");
    }
  }
}
