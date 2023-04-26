package svetlanaProycheva.cleaning.company;

import java.util.Queue;

public class DirtyDishes {

  private Queue<Boolean> dirtyDish;

  public DirtyDishes(Queue<Boolean> dirtyDish) {
    this.dirtyDish = dirtyDish;
  }

  public Queue<Boolean> getDirtyDish() {
    return dirtyDish;
  }

  public void setDirtyDish(Queue<Boolean> dirtyDish) {
    this.dirtyDish = dirtyDish;
  }

  @Override
  public String toString() {
    return " We have "+ dirtyDish.size()+" dirty dishes.";
  }
}
