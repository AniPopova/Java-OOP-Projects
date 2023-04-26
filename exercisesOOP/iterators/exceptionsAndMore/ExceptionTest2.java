package exercisesOOP.iterators.exceptionsAndMore;

public class ExceptionTest2 {

  public static void main(String[] args) {
    try {
      int chislitel = 5;
      int znamenatel = 0;
      System.out.println(chislitel / znamenatel);
      int[] numbers = {1, 3, 5};
      for (int i = 1; i <= 3; i++) {
        System.out.println(numbers[i]);
      }
    } catch (ArithmeticException e) {
      System.err.println("You tried to divide by zero!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("You try to get element with " + e.getMessage());
    }
  }
}


