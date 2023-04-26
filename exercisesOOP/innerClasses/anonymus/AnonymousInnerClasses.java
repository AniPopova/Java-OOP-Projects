package exercisesOOP.innerClasses.anonymus;

public class AnonymousInnerClasses {

  public static void main(String[] args) {
    /*ANONYMOUS CLASSES
    Анонимния клас е клас без име, който се използва за инстанцииране на един единствен обект само веднъж
    - може да наследява други класове и да имплементира интерфейси и има два начина за създаване на анонимен вътрешен клас
    1. Като наследи друг клас
    - позволяват ни да правим клас без име, който е наследник на друг клас за да създадем един единствен обект от този клас
    2. Чрез имплементация на интерфейс

    */

    Animal myAnimal = new Animal();
    myAnimal.makeNoise();

    //1. АНОНИМЕН КЛАС НАСЛЕДНИК НА ANIMAL, НЯМА ДА ГО ИЗПОЛЗВАМЕ ПОВЕЧЕ, НЕ Е НЕОБХОДИМО ДА ПРАВИМ ОТДЕЛЕН КЛАС ЗА НЕГО
    Animal darkElf = new Animal() { //така се създава клас за елф, който ще използваме само веднъж

      @Override
      public void makeNoise() {
        //super.makeNoise();
        System.out.println("Grrrrrrrrrr");
      }
    };
    darkElf.makeNoise(); //ползваме методите на анонимния клас, като елфа не е инстанция на животното, а на безименния анонимен клас


    //2. АНОНИМЕН КЛАС който имплементира интерфейс
    Runnable myAnonymousRunnable = new Runnable() { //правим инстанция на интерфейс като го преправяме на анонимен клас
      @Override
      public void run() {
        System.out.println("I am anonymous class from interface!");
      }
    };
    myAnonymousRunnable.run();
  }
}
