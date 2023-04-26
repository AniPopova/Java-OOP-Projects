package exercisesOOP.innerClasses.innerNestedLocal;

public class OuterClass {

  int number = 6;

  public void heyThere(){
    System.out.println("Hey there! I am the outer class.");

    class LocalInnerClass{ //СЪЗДАВАМЕ СИ КЛАС В МЕТОДА! Този клас може да се използва само и единствено в този метод "heyThere();"
      String localInnerClassVariable = "Here is the local class!"; //като всеки друг клас може да има полета

      public void printLocalInnerClass() {//като всеки друг клас може да има методи
        System.out.println(localInnerClassVariable);
      }
    }
    LocalInnerClass variable = new LocalInnerClass();//правим инстанция вътре в метода
    variable.printLocalInnerClass();//викаме методите на класа вътре в метода

  }

  public class InnerClass{
    int innerNumber = 8;

    public void whatsUp(){
      System.out.println("What's up from the Inner class!");
    }
  }
  public static class NestedClass{
    int nestedNumber = 10;

    public void hello(){
      System.out.println("What's up from the Nested class!");
    }
  }

}
