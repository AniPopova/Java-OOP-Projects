package svetlanaProycheva.exception;

public class DivisionDemo
{
  public static void main(String[] args)
  {
//    try {
//      int x = 10;
//      int y = 0;
//      System.out.println("division: " + (x / y));
//    }
//    catch (ArithmeticException ae) {
//      System.err.println("Not allowed "+ae.getMessage());
//    } finally {
//
//    }

//    try {
//      int[] demoArray = {2, 8, 9, 15};
//
//      for (int i = 0; i <= 10; i++) {
//        System.out.println(demoArray[10]);
//      }
//    } catch (ArrayIndexOutOfBoundsException aiobe){
//      System.err.println(aiobe.getLocalizedMessage()+" and "+aiobe.getCause());
//    }


      randInt(5, 3);

  }

  public static int randInt(int low, int high)
  {
    if (low >= high) throw new IllegalArgumentException("low must be less than or equal to high");
    return low + (int) (Math.random() * (high - low + 1));
  }

}