package exercisesOOP.iterators.exceptionsAndMore;

public class ExceptionTest3 {

  public static void main(String[] args) {
    try {
      Object o = null;
      int chislitel = 5;
      int znamenatel = 2;
      System.out.println(chislitel / znamenatel);
      int[] numbers = {1, 3, 5};
      for (int i = 0; i <= 2; i++) {
        System.out.println(numbers[i]);
      }
      System.out.println(o.equals(o));
      // не можем да викаме методи на обект със стойност null, защото така се генерира изключение
    } catch (ArithmeticException e) {//1во изключение
      System.err.println("You tried to divide by zero!");
    } catch (ArrayIndexOutOfBoundsException e) {//2ро изключение
      System.err.println("You try to get element with " + e.getMessage());
    } catch (Exception e) {
      //ако се окаже, че изключението не е нито първото, нито второто, то тук има всички видове изключение
      //общото трябва да е на последно място, а първи са частните случаи на класа Ексепшън
      System.err.println("Something went wrong");
    }
  }
}


