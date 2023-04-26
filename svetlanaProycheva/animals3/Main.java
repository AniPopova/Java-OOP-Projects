package svetlanaProycheva.animals3;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Shark shark = new Shark();
        Carp carp = new Carp();

        System.out.println("Eagle");
        eagle.speak();
        eagle.fly();
        System.out.println();
        System.out.println("Penguin");
        penguin.speak();
        penguin.swim();
        System.out.println();
        System.out.println("Dog");
        dog.speak();
        dog.swim();
        System.out.println();
        System.out.println("Cat");
        cat.speak();
        cat.swim();
        System.out.println();
        System.out.println("Shark");
        shark.swim();
        System.out.println();
        System.out.println("Carp");
        carp.swim();

    }
}
