package exercisesOOP.customExceptions;

public class AnotherException {

  public static void main(String[] args) {

  String name = null;
  printLength(name);
  }


  public static void printLength(String name) {
    //ако тук хвърлим throw new Exception(); ще изпише, че не познава типа на грешката - ТУК JAVA ПРОВЕРЯВА, ЗАЩОТО ГРЕШКАТА Е CHECKED
    //можем да хвърлим обаче throw new RuntimeException(); и ще работи - ТУК JAVA НИ ОСТАВЯ ДА РЕШИМ КОГА ДА ОПРАВИМ ГРЕШКАТА С TRY-CATCH
    throw new RuntimeException();
//    try {
//      System.out.println(name.length());
//    } catch (NullPointerException npe) {
//      System.out.println("String can not be null.");
//    }
  }
}
