package svetlanaProycheva.animals3;

public class Cat extends Mammal implements Speakable, Swimmable {
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void swim() {
        System.out.println("Hate water");
    }
}
