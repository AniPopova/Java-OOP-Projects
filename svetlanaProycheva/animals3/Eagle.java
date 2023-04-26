package svetlanaProycheva.animals3;

public class Eagle extends Bird implements Flyable, Speakable{
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void speak() {
        System.out.println("Eagle is speaking");
    }
}
