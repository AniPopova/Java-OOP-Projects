package svetlanaProycheva.animals3;

public class Dog extends Mammal implements Speakable, Swimmable{
    @Override
    public void speak() {
        System.out.println("Bau Bau");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
