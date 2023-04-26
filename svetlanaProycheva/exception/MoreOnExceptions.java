package svetlanaProycheva.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoreOnExceptions
{
  public static void main(String[] args) //if I throw an exception here I will only suppress it, and no need to handle it
  {
      Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Enter a whole number to divide: ");
      int x = scanner.nextInt();

      System.out.println("Enter a whole number to divide by: ");
      int y = scanner.nextInt();

      int z = x / y;
      System.out.println("The result of division is: " + z);
    }
    catch (ArithmeticException ae) {
      System.err.println("You can't divide by zero or things different from int! ");
    }
    catch (InputMismatchException ime) {
      System.err.println("PLEASE ENTER AN INTEGER NUMBER!");
    }
    catch (Exception e){
      System.err.println("Something went wrong!");
    }
    finally{
      scanner.close();
      System.out.println("I will always print!");
      System.exit(7);
    }
  }
}
