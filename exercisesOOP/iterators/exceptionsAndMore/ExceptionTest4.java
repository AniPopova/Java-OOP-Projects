package exercisesOOP.iterators.exceptionsAndMore;

public class ExceptionTest4 {

  public static void main(String[] args) {
    //   try {
    Object o = null;
    int chislitel = 5;
    int znamenatel = 0;
    try {
    int result = calculation(chislitel, znamenatel); // прибрахме деленето в метод
      System.err.println(chislitel+" / "+znamenatel+" = "+result);
    } catch (IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
//    int result;
//    if (znamenatel != 0) { // с тази проверка можем да избегнем try-catch проверката
//      result = chislitel / znamenatel;
//      System.err.println(chislitel+" / "+znamenatel+" = "+result);
//    else {
//      System.err.println("0 division was used.");
//      result = 0;
//    }


    int[] numbers = {1, 3, 5};
    for (int i = 0; i < numbers.length;
        i++) { // тук също си правим проверка с дължината на масива, в случай че тя се промени
      if (i >= 0 && i <= numbers.length) {
        System.out.println(numbers[i]);
      } else {
        System.out.println("Index out of boundaries.");
      }
    }
    if (o != null) {
      System.out.println(o.equals(o));
    } else {
      System.out.println("Object has not been initialized.");
    }
  }

  private static int calculation(int chislitel, int znamenatel) {
    int result = 0;
    if (znamenatel != 0) {
      result = chislitel / znamenatel;
    }
    else{
      throw new IllegalArgumentException("Знаменателят не трябва да е нула!");
    }
    return result;
  }
  // не можем да викаме методи на обект със стойност null, защото така се генерира изключение
//   catch(ArithmeticException e){//1во изключение
//      System.err.println("You tried to divide by zero!");
//    } catch(ArrayIndexOutOfBoundsException e){//2ро изключение
//      System.err.println("You try to get element with " + e.getMessage());
//    } catch(NullPointerException e){
//      System.err.println("Something went wrong" + e.getMessage());
//    } catch(Exception e){
//      System.err.println("Something went wrong");
//    }
}


