package exercisesOOP.casting;

public class Casting {

  public static void main(String[] args) {

    //1. UP_CASTING винаги работи и винаги става автоматично!!!
    Animal myAnimal = new Dog();
    Cat myCat = new Cat();
    Dog myDog = new Dog();
    //Upcasting означава, че кучето е животно. Няма нужда от (Animal)new Dog(); защото JAVA прави upcasting автоматично
    //всеки обект, който е обект на клас наследник на класа Animal е Animal
    doAnimalStuff(myAnimal);
    doAnimalStuff(myCat);
    doAnimalStuff(myDog);

    //2. DOWN_CASTING - не се случва автоматично, трябва сами да го направим и да направим подходящи проверки за него
    //ВИЖ МЕТОДА!!! - doAnimalStuff();
    //проверката - if (Х instanceof У){} ще ни осигури правилно функциониране на кода
    System.out.println(myAnimal instanceof Animal);
    System.out.println(myAnimal instanceof Dog);
    System.out.println(myAnimal instanceof Cat);
  }

  public static void doAnimalStuff(Animal animal) { //този метод взима всички обекти наследници на Animal и използва общия за всички метод makeNoise();
    animal.makeNoise();

    //DOWN_CASTING
    if (animal instanceof Dog){ //правим проверка за да не гръмне програмата ако животното не е куче
    Dog myDog = (Dog) animal; // казваме че нашето куче е животно
    myDog.growl();
    }

    else if(animal instanceof Cat){ // проверка за котката
      Cat myCat = (Cat)animal;
      myCat.makeCatStuff();
    }
  }
}
