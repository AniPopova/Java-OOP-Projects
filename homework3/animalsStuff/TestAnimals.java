package homework3.animalsStuff;

public class TestAnimals {

  public static void main(String[] args) {
    System.out.println("This is a fish.");
    Fish fish = new Fish();
    fish.eat();
    fish.play();
    fish.walk();
    fish.setName("Nemo");
    System.out.println(fish);
    System.out.println("+++++++++++++++++++++++++++++++++++++++");

    System.out.println("This is a cat.");
    Cat cat = new Cat();
    cat.setName("Fluffy");
    cat.eat();
    cat.walk();
    cat.play();
    System.out.println(cat);
    System.out.println("+++++++++++++++++++++++++++++++++++++++");

    System.out.println("This is a fish.");
    Animal fish2 = new Fish();
    fish2.eat();
    if(fish2 instanceof Fish){
    ((Fish) fish2).play();
    ((Fish) fish2).setName("Nemo The Second");
    }
    fish2.walk();
    System.out.println(fish2);
    System.out.println("+++++++++++++++++++++++++++++++++++++++");

    System.out.println("This is a spider.");
    Animal spider = new Spider();
    spider.eat();
    spider.walk();
    System.out.println(spider);
    System.out.println("+++++++++++++++++++++++++++++++++++++++");

    System.out.println("This is a cat.");
    Pet cat2 = new Cat();
    cat2.setName("Bob");
    cat2.getName();
    if(cat2 instanceof Cat){
    ((Cat) cat2).eat();
    ((Cat) cat2).walk();
    }
    cat2.play();
    System.out.println(cat2);

  }
}
