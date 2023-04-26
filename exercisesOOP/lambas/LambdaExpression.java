package exercisesOOP.lambas;

public class LambdaExpression {

  public static void main(String[] args) {

    Cat myCat = new Cat();
   //myCat.print();
   // printThing(myCat);
//    printThing(
//        () -> {
//          System.out.println("Meow");
//        }
//    );
//    printThing(() -> System.out.println("Meow"));
//
//    Printable lambdaPrintable = () -> System.out.println("Meow");
    Printable lambdaPrintable = (s) -> System.out.println("Meow");
    printThing(lambdaPrintable);



  }

  static void printThing(Printable thing) {
    thing.print("!");
  }

}
