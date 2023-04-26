package svetlanaProycheva.animals3;

public class Penguin extends Bird implements Swimmable, Speakable{

    @Override
    public void speak() {
        System.out.println("I don't know");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
