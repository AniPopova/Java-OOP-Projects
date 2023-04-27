/**
 * Observer Pattern: This pattern defines a one-to-many dependency between objects,
 * where a change in one object triggers updates to its dependent objects. The Observer pattern is often used in
 * event-driven programming, where one or more objects (called "observers" or "listeners") are notified when a change
 * occurs in another object (called the "subject" or "observable").
 *
 * In Java, the observer pattern is commonly used in conjunction with the listener pattern. For example, the Swing
 * GUI framework uses the observer pattern extensively to notify listeners of user interface events such as button
 * clicks or mouse movements.
 *
 * So, you can think of the listener pattern as a specific implementation of the observer pattern, where the observer
 * objects are referred to as "listeners" and are typically registered with a specific event source (such as a button
 * or a mouse). When the event occurs, the source object notifies all of its registered listeners, who then perform
 * some action in response to the event.
 */

import java.util.ArrayList;
import java.util.List;
public class ObserverPattern
{
  public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
      return state;
    }

    public void setState(int state) {
      this.state = state;
      notifyAllObservers();
    }

    public void attach(Observer observer) {
      observers.add(observer);
    }

    public void notifyAllObservers() {
      for (Observer observer : observers) {
        observer.update();
      }
    }
  }

  public abstract class Observer {
    protected Subject subject;
    public abstract void update();
  }

  public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this);
    }

    @Override
    public void update() {
      System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
  }

  public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this);
    }

    @Override
    public void update() {
      System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
  }

  public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this);
    }

    @Override
    public void update() {
      System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
  }

}
