package exercisesOOP.normalExceptions;

public class ExceptionHandling {

  public static void main(String[] args) {
    try {
      int myInt = Integer.parseInt("1");
      System.out.println("After parsing pants");
    } catch (NumberFormatException | NullPointerException nfe) { //escape from multiple catches
      System.out.println("Hey dude, you can't make an int out of that. Stop and try again");
    }
    finally {
      System.out.println("in the finally block");
    }
//    catch (NullPointerException npe) {
//      System.out.println("Hey dude, you can't make an int out of that. Stop and try again");
//    }
//    try {
//      // Code that may cause an exception
//   //   int myInt = Integer.parseInt("pants");
//      int myInt = Integer.parseInt("1");
//
//    } catch (NumberFormatException nfe) { //the name is according to the convention where it is used the initials of the type of exception
//      //Code that we want to execute if this type of exception occurs
//      System.out.println("Hey dude, you can't make an int out of that. Stop and try again");
//    }
//    catch(Throwable t) {
//      // NEVER DO THAT!!! IT IS NOT RECOMMENDED! IT IS FOR CATCHING ERRORS, AND WE WANT TO CATCH EXCEPTIONS
//    }
    System.out.println("End here.");
    System.out.println(printANumber());
  }

//  private static void getInt() {
//      int myInt = Integer.parseInt("1");
//
//  }

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
