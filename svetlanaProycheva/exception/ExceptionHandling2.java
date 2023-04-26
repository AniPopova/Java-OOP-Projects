package svetlanaProycheva.exception;


import java.util.Scanner;

public class ExceptionHandling2
{
  public static void main(String[] args)
  {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a integer number: ");
      String methodTest = scanner.nextLine();
      getInt(methodTest); // всичко, което е в TRY и се намира след хвърленото изключение няма да се изпълни
      System.out.println("Мен ме няма, защото има exception! Ако ме видиш всичко е наред!");
    }
    catch (NumberFormatException | NullPointerException nfe) {
      System.err.println("You can not make an int out of that?!?");
    }
    finally { //Тук слагаме код, който да се изпълни без значение дали има изключение или не
      System.out.println("Start the program again!");
    }
    System.out.println(printANumber());
  }

  private static int getInt(String str)
  {
    int myInt = Integer.parseInt(str);
    return myInt;
  }
  @SuppressWarnings("ReturnInsideFinallyBlock")
  private static int printANumber(){
    try {
      return 3;
    }
    catch (Exception e) {
      return 4;
    }
    finally {
      return 5;
    }
  }
}
